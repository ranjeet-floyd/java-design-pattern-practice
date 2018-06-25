package com.self.design.pattern.abstract_factory.castel;

import com.self.design.pattern.abstract_factory.castel.imp.KingdomFactory;
import com.self.design.pattern.abstract_factory.castel.imp.elven.ElfKingdomFactory;
import com.self.design.pattern.abstract_factory.castel.imp.orc.OrcKingdomFactory;

public class FactoryMaker {

	public enum KingdomType {
		ELF, ORC
	}

	public static KingdomFactory getKingdomFactory(KingdomType kingdomType) {

		switch (kingdomType) {
			case ELF:
				return new ElfKingdomFactory();
			case ORC:
				return new OrcKingdomFactory();
			default:
				throw new IllegalArgumentException("KingdomType not supported !.");
		}

	}

	public static void main(String[] args) {
		KingdomFactory kingdomFactory = getKingdomFactory(KingdomType.ELF);
		Army army = kingdomFactory.createArmy();
		System.out.println(army.getDescription());

		Castel castel = kingdomFactory.createCastel();
		System.out.println(castel.getDescription());


		King king = kingdomFactory.createKing();
		System.out.println(king.getDescription());


	}
}
