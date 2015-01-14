package com.autohome.design_patterns.observer.demo1;

/**
 * 具体的目标对象, 负责把有关状态存入到相应的观察者对象
 * 并在自己状态发生改变时, 通知各个观察者
 * @author nxcjh
 *
 */
public class ConcreteSuject extends Subject{

	/**
	 * 示意, 目标对象的状态
	 */
	private String subjectStats;
	public String getSubjectStats(){
		return subjectStats;
	}
	public void setSubjectStats(String subjectStats) {
		this.subjectStats = subjectStats;
		//状态发生了改变, 通知各个观察者
		this.notifyObservers();
	}
	
	
}
