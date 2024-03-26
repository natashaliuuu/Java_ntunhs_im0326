package Hw5_2;

public class Hw5_2 {
	public static void main(String[] args) {
		var card1 = new StoreValueCard("A001",500,0);
		System.out.printf("(%s, %d, %d)%n", 
				card1.cardId, card1.balance, card1.bonus);
	
		var card2 = new StoreValueCard("A002",300,0);
		System.out.printf("(%s, %d, %d)%n", 
				card2.cardId, card2.balance, card2.bonus);
	
		var card3 = new StoreValueCard("A003",1000,1);
		System.out.printf("(%s, %d, %d)%n", 
				card3.cardId, card3.balance, card3.bonus);
	}
}

class StoreValueCard{
	String cardId;
	int balance;
	int bonus;
	
	StoreValueCard(String cardId, int balance, int bonus){
		this.cardId = cardId;
		this.balance = balance;
		this.bonus = bonus;
	}
}
