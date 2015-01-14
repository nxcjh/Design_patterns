package com.autohome.design_patterns.observer.demo1;

/**
 * 具体观察者对象, 实现更新的方法, 使自身的状态和目标的状态保持一致
 * @author nxcjh
 *
 */
public class ConcreteObserver implements Observer{

	private String observerState;
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

	@Override
	public void update(Subject subject) {
		//具体的更新实现
		//这里可能需要跟新观察者的状态, 使其与目标的状态保持一致
		ConcreteSuject c_subject = (ConcreteSuject)subject;
		observerState = c_subject.getSubjectStats();
		System.out.println(name +"=="+observerState);
		
	}

}
