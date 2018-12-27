package com.demo;

public class TestMain {

	// 松耦合：统一管理逻辑。
	public static void main(String[] args) {

		// 主题：获取天气主题实例
		WeatherData weatherData = new WeatherData();

		// 观察者：订阅天气情况
		CurrentConditionsDiaplay conditionsDiaplay = new CurrentConditionsDiaplay(weatherData);

		// 更新数据
		weatherData.setWeatherData();
	}

}
