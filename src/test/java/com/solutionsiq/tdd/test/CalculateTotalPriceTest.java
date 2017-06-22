package com.solutionsiq.tdd.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.solutionsiq.tdd.CalculateTotalPrice;

public class CalculateTotalPriceTest {
	CalculateTotalPrice calTotal;
	
	@Before
	public void setUp() throws Exception {
		calTotal = new CalculateTotalPrice();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_calculate_price_when_2_itemEach_ofDifferent_price_isPurchasedIndefinateNumber() {
	
		int useritem1=2;
		int useritem2=3;
		int userItemprice1 = 5;
		int userItemprice2 = 6;
		
		calTotal.cumulativeItemlist[0]=useritem2;
		calTotal.cumulativeItemlist[1]=useritem1;
		calTotal.cumulativeprice[0]= userItemprice2;
		calTotal.cumulativeprice[1]=userItemprice1;

		assertEquals(28,calTotal.calculatecumulativepricewithItems(), 2);

	}

}
