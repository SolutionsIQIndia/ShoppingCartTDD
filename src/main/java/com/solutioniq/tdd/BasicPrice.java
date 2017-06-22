package com.solutioniq.tdd;

public class BasicPrice {
	public int price;
	public int item;
	int totalprice;
	int price1;
	int price2;
	public int cumulativeprice[] =new int[100];

	public int calculatetotalprice() {
		totalprice=item*price;
		return totalprice;
	}
	
	public int calculatePriceWhenDifferent() {
		calculatepriceofNdifferentitems();
		calculatetotalprice();
		return totalprice;
	}
	
	public int calculatepriceofNdifferentitems(){
		for(int i=0;i<cumulativeprice.length;i++){
			price=price+cumulativeprice[i];
		}
		return price;
	}

}
