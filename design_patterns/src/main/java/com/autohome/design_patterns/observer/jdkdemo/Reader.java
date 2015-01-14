package com.autohome.design_patterns.observer.jdkdemo;

import java.util.Observable;
import java.util.Observer;

/**
 * 真正的读者,
 * 实现JDK的Observer
 * @author nxcjh
 *
 */
public class Reader implements Observer{

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void update(Observable o, Object arg) {
		//这里采用推的方式
		//对于要获取推的数据, 在目标实现里面调用的时候悲喜要用推的方法, 就是带参数的那个, 否则这里为null
		System.out.println(name+": 收到了报纸, 内容:"+arg.toString());
		
		//这里获取数据的方式为拉
		System.out.println(name+"==收到了报纸, 内容:"+((NewsPaper)o).getContent());
	}

}
