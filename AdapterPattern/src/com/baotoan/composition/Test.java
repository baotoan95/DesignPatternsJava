package com.baotoan.composition;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		ShowListName showListName = new ShowListName();
		List<String> listName = new ArrayList<>();
		listName.add("  Toan ");
		listName.add(" Huy   ");
		listName.add("        Linh   ");
		showListName.showListName(listName);
	}
}
