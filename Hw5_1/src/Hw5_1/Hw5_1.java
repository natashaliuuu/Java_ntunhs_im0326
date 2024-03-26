package Hw5_1;

public class Hw5_1 {
	public static void main(String[] args) {
		var card1 = new StoreValueCard();
		card1.cardId = "A001";
		card1.balance = 500;
		card1.bonus = 0;
		System.out.printf("(%s, %d, %d)%n", 
				card1.cardId, card1.balance, card1.bonus);
		
		var card2 = new StoreValueCard();
		card2.cardId = "A002";
		card2.balance = 300;
		card2.bonus = 0;		
		System.out.printf("(%s, %d, %d)%n", 
				card2.cardId, card2.balance, card2.bonus);
		
		var card3 = new StoreValueCard();
		card3.cardId = "A003";
		card3.balance = 1000;
		card3.bonus = 1;		
		System.out.printf("(%s, %d, %d)%n", 
				card3.cardId, card3.balance, card3.bonus);
	}	
}

class StoreValueCard{
	String cardId;
	int balance;
	int bonus;
}
