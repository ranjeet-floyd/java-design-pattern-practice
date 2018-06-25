package com.self.design.pattern.abstract_factory.castel.imp;

import com.self.design.pattern.abstract_factory.castel.Army;
import com.self.design.pattern.abstract_factory.castel.Castel;
import com.self.design.pattern.abstract_factory.castel.King;

public interface KingdomFactory {
	Castel createCastel();

	King createKing();

	Army createArmy();

}
