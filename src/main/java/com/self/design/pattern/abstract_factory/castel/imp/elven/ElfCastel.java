package com.self.design.pattern.abstract_factory.castel.imp.elven;

import com.self.design.pattern.abstract_factory.castel.Castel;

public class ElfCastel implements Castel {
	static final String DESCRIPTION = "This is Elven Castel.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
