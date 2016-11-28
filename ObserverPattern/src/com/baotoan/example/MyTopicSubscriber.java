package com.baotoan.example;

public class MyTopicSubscriber implements Observer {
	private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate();
		if(null == msg) {
			System.out.println(name + ":: No new message");
		} else {
			System.out.println(name + ":: " + msg);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

}
