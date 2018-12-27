package com.demo;

// 主题
public interface Subject {
	void registObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}
