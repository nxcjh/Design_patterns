package com.autohome.design_patterns.observer.jdkdemo;


/**
 * 测试类
 * @author nxcjh
 *
 */
public class Client {

	public static void main(String[] args) {
		//创建观察者
		Reader observer1 = new Reader();
		observer1.setName("张三");
		
		Reader observer2 = new Reader();
		observer2.setName("李四");
		
		Reader observer3 = new Reader();
		observer3.setName("王五");
		
		//创建目标对象
		NewsPaper subject = new NewsPaper();
		//在目标对象上注册观察者
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		//目标对象状态更改
		subject.setContent(" 新版集训");
	}
	
}
