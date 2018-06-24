package com.self.design.pattern.factory;

public class App {

	public static void main(String[] args) {
		String name = "Ranjeet Kumar";
		computeName(name);
		String name2 = "Kumar,Ranjeet";
		computeName(name2);

	}

	private static void computeName(String s) {
		NameFactory nameFactory = new NameFactory();
		Namer namer = nameFactory.getNamer(s);
		System.out.println(namer.getFirst() + " " + namer.getLast());
	}
}
