package com.demo;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	@Override
	public void registObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0)
			observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update();
		}
	}

	public void weatherDataChanged() {
		notifyObservers();
	}

	public void setWeatherData() {
		weatherDataChanged();
	}

}
