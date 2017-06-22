package com.solutionsiq.tdd.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.solutioniq.tdd.BasicPrice;
import com.solutioniq.tdd.Discount;

public class BasicPriceTest {
	
	BasicPrice bp ;
	Discount dc ;
	
	@Before
	public void setUp() throws Exception {
		bp= new BasicPrice();
		dc= new Discount(bp);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Should_calculate_basic_price_when_items_are_same() {
		//int item=2,price=3;
		//BasicPrice bp = new BasicPrice( );
		bp.item=2;
		bp.price=3;
		assertEquals(6,bp.calculatetotalprice());
	}
	
	@Test
	public void should_calculate_basic_price_when_items_are_different(){
		
		//BasicPrice bp= new BasicPrice();
		int price1=3;
		bp.cumulativeprice[0]=price1;
		int price2=2;
		bp.cumulativeprice[1]=price2;
		bp.item=1;
		assertEquals(5,bp.calculatePriceWhenDifferent());
	}
	
}
