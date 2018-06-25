package com.self.design.pattern.abstract_factory.castel.imp.orc;

import com.self.design.pattern.abstract_factory.castel.King;

public class OrcKing implements King {
	final static String DESCRIPTION = "This is orc King !.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
