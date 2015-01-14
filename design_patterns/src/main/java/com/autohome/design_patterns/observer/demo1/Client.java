package com.autohome.design_patterns.observer.demo1;




import com.autohome.design_patterns.observer.demo1.ConcreteObserver;
import com.autohome.design_patterns.observer.demo1.ConcreteSuject;

/**
 * 测试类
 * @author nxcjh
 *
 */
public class Client {

	public static void main(String[] args) {
		//创建观察者
		ConcreteObserver observer1 = new ConcreteObserver();
		observer1.setName("张三");
		
		ConcreteObserver observer2 = new ConcreteObserver();
		observer1.setName("李四");
		
		ConcreteObserver observer3 = new ConcreteObserver();
		observer1.setName("王五");
		
		//创建目标对象
		ConcreteSuject subject = new ConcreteSuject();
		//在目标对象上注册观察者
		subject.attatch(observer1);
		subject.attatch(observer2);
		subject.attatch(observer3);
		//目标对象状态更改
		subject.setSubjectStats("哈哈, 新闻更新啦");
		//通知所有的观察者
		subject.notifyObservers();
	}
	
}
