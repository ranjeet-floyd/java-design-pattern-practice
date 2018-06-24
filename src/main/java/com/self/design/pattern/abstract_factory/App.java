package com.self.design.pattern.abstract_factory;

public class App {
	/**
	 * Suppose you are writing a program to plan the layout of gardens.
	 * These could be annual gardens, vegetable gardens or perennial gardens.
	 * However, no matter which kind of garden you are planning, you want to ask
	 * the same questions:
	 * 1. What are good border plants?
	 * 2. What are good center plants?
	 * 3. What plants do well in partial shade?
	 */

	public static void main(String[] args) {
		GardenMaker gardenMaker = new GardenMaker();
		Garden garden = gardenMaker.getGarden(GardenType.DEFAULT);
		System.out.println(garden.getBorder());
		System.out.println(garden.getCenter());
		System.out.println(garden.getShade());
	}
}
