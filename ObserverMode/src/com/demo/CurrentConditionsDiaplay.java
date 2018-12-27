package com.demo;

// 观察者：实现注册天气情况接口
public class CurrentConditionsDiaplay implements Observer {

	public CurrentConditionsDiaplay(Subject weatherData) {
		weatherData.registObserver(this);
	}

	@Override
	public void update() {
		System.out.println("接收到数据更新通知!");
	}

}
