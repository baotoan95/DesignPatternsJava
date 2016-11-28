package com.baotoan.composition;

import java.util.List;

public class ShowListName implements IShowListName {
	private ShowName showName;
	
	public ShowListName() {
		this.showName = new ShowName();
	}

	@Override
	public void showListName(List<String> listName) {
		for(String name : listName) {
			System.out.println(showName.standardize(name));
		}
	}

}
