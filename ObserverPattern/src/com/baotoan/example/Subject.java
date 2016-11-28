package com.baotoan.example;

public interface Subject {
	public void register(Observer observer);
	public void unregistry(Observer observer);
	public void notifyObservers();
	public Object getUpdate();
}
