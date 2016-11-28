package com.baotoan.inherdapter;

import java.util.List;

public class ShowListName extends ShowName implements IShowListName {

	@Override
	public void showListName(List<String> listName) {
		for(String name : listName) {
			System.out.println(standardize(name));
		}
	}

}
