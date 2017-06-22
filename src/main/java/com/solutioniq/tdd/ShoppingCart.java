package com.solutioniq.tdd;

public class ShoppingCart {

	int item;
	int price;
	int cost;
	int price1;
	int price2;
	
	public ShoppingCart(int price, int item){
		this.price=price;
		this.item=item;
	}
	
	public ShoppingCart(){
		
	}

	public Object calculateTotalPrice(boolean itemsdifferent) {
		if (itemsdifferent) {
			cost = price * item;

		} else {
			caldifferentItemprice();
		}
		return cost;
	}

	public void caldifferentItemprice() {
		// TODO Auto-generated method stub
		price = price1 + price2;

	}

}
