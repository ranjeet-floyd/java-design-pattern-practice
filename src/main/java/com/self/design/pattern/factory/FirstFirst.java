package com.self.design.pattern.factory;

public class FirstFirst extends Namer {

	public FirstFirst(String s) {
		int i = s.indexOf(" ");// find sep space
		if (i > 0) {
			first = s.substring(0, i).trim();
			last = s.substring(i + 1);
		} else {
			first = "";
			last = s;
		}
	}
}
