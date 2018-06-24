package com.self.design.pattern.factory;

public class NameFactory {

	public Namer getNamer(String entry) {
		int i = entry.indexOf(",");
		if (i > 0) {
			return new LastLast(entry);
		} else {
			return new FirstFirst(entry);
		}
	}
}
