package com.autohome.design_patterns.observer.demo1;

/**
 * 观察者接口, 定义一个更新的接口给哪些在目标发生改变时被通知的对象
 * @author nxcjh
 *
 */
public interface Observer {

	/**
	 * 更新的接口
	 * @param subject 传入目标对象, 方便获取相应的目标对象的状态
	 */
	public void update(Subject subject);
	
}
