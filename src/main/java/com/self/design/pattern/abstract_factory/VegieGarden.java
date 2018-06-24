package com.self.design.pattern.abstract_factory;

public class VegieGarden extends Garden {
	@Override
	public Plant getCenter() {
		return new Plant("Corn");
	}

	@Override
	public Plant getBorder() {
		return new Plant("Peas");
	}

	@Override
	public Plant getShade() {
		return new Plant("Broccolli");
	}
}
