package com.autohome.design_patterns.observer.jdkdemo;

import java.util.Observable;

/**
 * 继承JDK里面提供的Observable类
 * 报纸对象, 具体的实现目标
 * @author nxcjh
 *
 */
public class NewsPaper extends Observable{

	/**
	 * 报纸的具体内荣
	 */
	private String content;

	public String getContent() {
		return content;
	}

	/**
	 * 设置报纸的具体内容, 相当于要出版报纸了
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
		//内容有了, 说明又出版新的报纸了, 那就通知所有的读者
		//注意用Java中的Observer模式的时候, 下面这句话不可少
		this.setChanged();
		//然后主动通知, 这里用的是推的方式
		this.notifyObservers(this.content);
		//如果用拉的方式, 就调用
		this.notifyObservers();
	}
	
}
