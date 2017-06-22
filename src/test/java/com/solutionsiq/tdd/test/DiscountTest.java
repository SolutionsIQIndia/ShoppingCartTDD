package com.solutionsiq.tdd.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.solutioniq.tdd.BasicPrice;
import com.solutioniq.tdd.Discount;

public class DiscountTest {
	BasicPrice bp;
	Discount dc;
	@Before
	public void setUp() throws Exception {
		bp= new BasicPrice();
		dc= new Discount(bp);
	}

	@After
	public void tearDown() throws Exception {
	}

	public void should_calculate_discount_if_coupon_code_matches(){
		bp.item=2;
		bp.price=5;
		dc.isCouponMacthing=true;
		assertEquals(9,dc.calculateDiscount(true),2);
	}
	
	@Test
	public void discount_on_purchase_of_two_items(){
		bp.item=2;
		bp.price=5;
		dc.purchaseoftwoitems=true;
		assertEquals(9.5,dc.calculateDiscountOnPurchaseOfTwoItems(true),2);
	}
	
	@Test
	public void discount_on_purchase_of_two_different_items(){
		bp.item=1;
		int price1=10;
		bp.cumulativeprice[0]=price1;
		int price2=20;
		bp.cumulativeprice[1]=price2;
		dc.purchaseoftwodifferentitems=true;
		assertEquals(30,dc.calculateDiscountOnPurchaseOfTwoDifferentItems(true),2);
	}
	
	@Test
	public void discount_on_purchase_of_itemnumber_2(){
		bp.item=1;
		bp.price=10;
		dc.discountonitem2=true;
		assertEquals(8,dc.calculateDiscountOnItem2(true),2);
	}
	
	@Test
	public void discount_on_purchase_of_itemnumber_2_with_coupon(){
		bp.item=1;
		int price=15;
		bp.cumulativeprice[0]=price;
		dc.discountonitem2withcoupon=true;
		assertEquals(10.5,dc.calculateDiscountOnItem2WithCoupon(true),3);
	}
	
	@Test
	public void discount_on_purchase_of_item_with_itemnumber_2(){
		bp.item=2;
		int price1=15;
		bp.cumulativeprice[0]=price1;
		int price2=20;
		bp.cumulativeprice[1]=price2;
		dc.discountforpurchaseofitemwithitemnumber2=true;
		assertEquals(61.9,dc.calculateDiscountOnPurchaseOfItemWithItemnumber2(true),3);
	}
	
	@Test
	public void discount_on_purchase_of_item_with_itemnumber_2_with_coupon_and_different_price(){
		bp.item=2;
		int price1=20;
		bp.cumulativeprice[0]=price1;
		int price2=18;
		bp.cumulativeprice[1]=price2;
		dc.discountonpurchaseofitemwithitemnumber2andcouponcodeanddifferentprice=true;
		assertEquals(60,dc.calculatediscountonpurchaseofitemwithitemnumber2couponcodeanddifferentprice(true),3);	
	}
	
	@Test
	public void should_calculate_total_price_when_n_items_are_have_different_prices(){
		bp.item=3;
		int price1=10;
		bp.cumulativeprice[0]=price1;
		int price2=20;
		bp.cumulativeprice[1]=price2;
		int price3=20;
		bp.cumulativeprice[2]=price3;
		assertEquals(150, bp.calculatePriceWhenDifferent());
	}

	@Test
	public void should_give_discount_on_purchase_of_item2_and_item5(){
		bp.item=2;
		int price1=5;
		bp.cumulativeprice[0]=price1;
		int price2=7;
		bp.cumulativeprice[1]=price2;
		dc.discountonpurchaseofitem2anditem5=true;
		assertEquals(16.8,dc.calculatediscountonpurchaseofitem2anditem5(true),3);
	}
	
	@Test
	public void should_give_discount_on_purchase_of_item2_and_item5_with_coupon(){
		bp.item=2;
		int price1=7;
		bp.cumulativeprice[0]=price1;
		int price2=8;
		bp.cumulativeprice[1]=price2;
		dc.discountonpurchaseofitem2anditem5withcoupon=true;
		assertEquals(18,dc.calculatediscountonitem2anditem5withcoupon(true),3);
	}
	
	@Test
	public void should_give_discount_on_purchase_of_item2_and_item5_with_same_price(){
		bp.item=2;
		bp.price=9;
		dc.discountonpurchaseofitem2anditem5withsameprice=true;
		assertEquals(12.6,dc.calculatediscountonitem2anditem5withsameprice(true),3);
	}
}
