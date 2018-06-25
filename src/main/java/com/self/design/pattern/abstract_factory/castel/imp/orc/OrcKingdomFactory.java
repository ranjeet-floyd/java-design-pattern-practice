package com.self.design.pattern.abstract_factory.castel.imp.orc;

import com.self.design.pattern.abstract_factory.castel.Army;
import com.self.design.pattern.abstract_factory.castel.Castel;
import com.self.design.pattern.abstract_factory.castel.King;
import com.self.design.pattern.abstract_factory.castel.imp.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {
	@Override
	public Castel createCastel() {
		return new OrcCastel();
	}

	@Override
	public King createKing() {
		return new OrcKing();
	}

	@Override
	public Army createArmy() {
		return new OrcArmy();
	}
}
