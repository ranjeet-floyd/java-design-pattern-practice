package com.self.design.pattern.abstract_factory;

public class GardenMaker {
	private Garden garden;

	public Garden getGarden(GardenType gardenType) {
		if (gardenType.equals(GardenType.DEFAULT)) {
			this.garden = new VegieGarden();
		} else {

			if (gardenType.equals(GardenType.ANNUAL)) {
				this.garden = new AnnualGarden();
			}

		}

		return garden;
	}
}
