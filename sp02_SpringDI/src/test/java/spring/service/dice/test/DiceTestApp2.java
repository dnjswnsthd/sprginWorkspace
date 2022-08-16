package spring.service.dice.test;

import spring.service.dice.play.Player01;
import spring.service.dice.play.Player02;

/*
 * FileName : DiceTestApp01.java
 * ㅇ DiceA / Player01 Test 하는 Application 
 */
public class DiceTestApp2 {
	///Main Method
	public static void main(String[] args){
		
		Player01 player01 = new Player01();
		player01.playDice(3);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player01.getTotalValue());
		System.out.println("=======================");
		
		
		Player02 player02= new Player02();
		player02.playDice(3);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player01.getTotalValue());
		System.out.println("=======================");
		
	}
}//end of class

