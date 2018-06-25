package com.self.design.pattern.abstract_factory.castel.imp.elven;

import com.self.design.pattern.abstract_factory.castel.Army;

public class ElfArmy implements Army {
	static final String DESCRIPTION = "This is Elven Army !.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
