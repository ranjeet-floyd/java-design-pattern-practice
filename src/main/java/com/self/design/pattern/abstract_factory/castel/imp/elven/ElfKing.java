package com.self.design.pattern.abstract_factory.castel.imp.elven;

import com.self.design.pattern.abstract_factory.castel.King;

public class ElfKing implements King {
	static final String DESCRIPTION = "This is Elven king !.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
