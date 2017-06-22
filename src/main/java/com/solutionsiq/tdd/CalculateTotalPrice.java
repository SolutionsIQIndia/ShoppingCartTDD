package com.solutionsiq.tdd;

public class CalculateTotalPrice {
	
	int cost;
	public int[] cumulativeprice = new int[100];
	public int[] cumulativeItemlist =new int[100];
	public int calculatecumulativepricewithItems(){
		
		for (int i = 0; i < cumulativeprice.length; i++) {
			cost = cost+ cumulativeItemlist[i]*cumulativeprice[i];
			
		}
		return cost;
	
	}

}
