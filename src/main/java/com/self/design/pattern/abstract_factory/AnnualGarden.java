package com.self.design.pattern.abstract_factory;

public class AnnualGarden extends Garden {
	@Override
	public Plant getCenter() {
		return new Plant("Annual Garden");
	}

	@Override
	public Plant getBorder() {
		return new Plant("Annual Border");
	}

	@Override
	public Plant getShade() {
		return new Plant("Annual Shade");
	}
}
