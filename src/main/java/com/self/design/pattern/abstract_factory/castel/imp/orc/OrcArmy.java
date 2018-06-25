package com.self.design.pattern.abstract_factory.castel.imp.orc;

import com.self.design.pattern.abstract_factory.castel.Army;

public class OrcArmy implements Army {
	final static String DESCRIPTION = "This is orc Amry.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
