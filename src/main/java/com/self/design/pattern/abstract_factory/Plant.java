package com.self.design.pattern.abstract_factory;

public class Plant {
	private final String name;

	public Plant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Plant{" +
				"name='" + name + '\'' +
				'}';
	}
}
