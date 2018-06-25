package com.self.design.pattern.abstract_factory.castel.imp.elven;

import com.self.design.pattern.abstract_factory.castel.Army;
import com.self.design.pattern.abstract_factory.castel.Castel;
import com.self.design.pattern.abstract_factory.castel.King;
import com.self.design.pattern.abstract_factory.castel.imp.KingdomFactory;
import com.self.design.pattern.abstract_factory.castel.imp.elven.ElfArmy;
import com.self.design.pattern.abstract_factory.castel.imp.elven.ElfCastel;
import com.self.design.pattern.abstract_factory.castel.imp.elven.ElfKing;

public class ElfKingdomFactory implements KingdomFactory {
	@Override
	public Castel createCastel() {
		return new ElfCastel();
	}

	@Override
	public King createKing() {
		return new ElfKing();
	}

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}
}
