package edu.wcc.emeyer.cps278_mp2_xml;

import org.springframework.stereotype.Component;

@Component("bg")
public class Battle {
	
	BattleGround battleGround;
	
	private Character character1;
	private Character character2;
	
	
	
	public void fight() {
		System.out.println(battleGround.getBattleGroundDesc() + character1.getName() 
		+ "and " + character2.getName()
				+ " are fighting! ");
		character1.useFightingPower();
		character2.useFightingPower();
		
	}



	public BattleGround getBattleGround() {
		return battleGround;
	}



	public void setBattleGround(BattleGround battleGround) {
		this.battleGround = battleGround;
	}



	public Character getCharacter1() {
		return character1;
	}



	public void setCharacter1(Character character1) {
		this.character1 = character1;
	}



	public Character getCharacter2() {
		return character2;
	}



	public void setCharacter2(Character character2) {
		this.character2 = character2;
	}
	
}
