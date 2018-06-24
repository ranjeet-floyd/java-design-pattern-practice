package com.self.design.pattern.factory;

public class LastLast extends Namer {
	public LastLast(String s) {
		int i = s.indexOf(",");// find sep space
		if (i > 0) {
			last = s.substring(0, i).trim();
			first = s.substring(i + 1).trim();
		} else {
			first = "";
			last = s;
		}
	}
}
