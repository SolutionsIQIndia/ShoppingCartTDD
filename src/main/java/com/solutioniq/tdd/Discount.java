package com.solutioniq.tdd;

public class Discount{
	BasicPrice bp;
	
	public boolean isCouponMacthing;
	public int discountrateonitem2=7;
	public int Coupondiscountrate=10;
	public int discountrate=5;
	public int discountonitem2anditem5=30;
	public boolean purchaseoftwoitems;
	public boolean purchaseoftwodifferentitems;
    public boolean discountonitem2;
	public boolean discountonitem2withcoupon;
	public boolean discountforpurchaseofitemwithitemnumber2;
	public boolean discountonpurchaseofitemwithitemnumber2andcouponcodeanddifferentprice;
	public boolean discountonpurchaseofitem2anditem5;
	public boolean discountonpurchaseofitem2anditem5withcoupon;
	public boolean discountonpurchaseofitem2anditem5withsameprice;
	
	public Discount(BasicPrice bp) {
		this.bp=bp;
	}

	public double calculateDiscount(boolean isCouponMatching) {
		bp.calculatetotalprice();
		if(isCouponMatching==true){
			bp.totalprice-=discountoncoupon();
		}
		return bp.totalprice;
	}

	private int discountoncoupon() {
		int discountedprice=(Coupondiscountrate*bp.totalprice)/100;
		return discountedprice;
	}

	public double calculateDiscountOnPurchaseOfTwoItems(boolean purchaseoftwoitems) {
		bp.calculatetotalprice();
		if(purchaseoftwoitems==true){
			bp.totalprice-=calculateDiscountedPriceForTwoItems();
		}
		return bp.totalprice;
	}

	private int calculateDiscountedPriceForTwoItems() {
		int discountfortwoitems=(discountrate*bp.totalprice)/100;
		return discountfortwoitems;
	}

	public double calculateDiscountOnPurchaseOfTwoDifferentItems(boolean purchaseoftwodifferentitems) {
		bp.calculatePriceWhenDifferent();
		if(purchaseoftwodifferentitems==true){
			bp.totalprice-=calculateDiscountForTwoDifferentItems();
		}
		return bp.totalprice;
	}

	private int calculateDiscountForTwoDifferentItems() {
		int discountpricefortwodifferentitems=(discountrate*bp.totalprice)/100;
		return discountpricefortwodifferentitems;
	}

	public double calculateDiscountOnItem2(boolean discountonitem2) {
		bp.calculatetotalprice();
		if(discountonitem2==true){
			bp.totalprice-=calculatediscountforitem2();
		}
		return bp.totalprice;
	}

	private int calculatediscountforitem2() {
		int discountforitem2=(discountrateonitem2*bp.totalprice)/100;
		return discountforitem2;
	}

	public double calculateDiscountOnItem2WithCoupon(boolean discountonitem2withcoupon) {
		bp.calculatePriceWhenDifferent();
		if(discountonitem2withcoupon==true){
			bp.totalprice-=calculateddiscountforitem2withcoupon();
		}
		return bp.totalprice;
	}

	private int calculateddiscountforitem2withcoupon() {
		int discountonitem2withcoupon=((discountrateonitem2+Coupondiscountrate)*bp.totalprice)/100;
		return discountonitem2withcoupon;
	}

	public int calculateDiscountOnPurchaseOfItemWithItemnumber2(boolean discountforpurchaseofitemwithitemnumber2) {
		bp.calculatePriceWhenDifferent();
		if(discountforpurchaseofitemwithitemnumber2==true){
			bp.totalprice-=calculatediscountforpurchaseofitemswithitemnumber2();
		}
		return bp.totalprice;
	}

	private int calculatediscountforpurchaseofitemswithitemnumber2() {
		int discountonpurchaseofitemswithitemnumber2=((discountrateonitem2+discountrate)*bp.totalprice)/100;
		return discountonpurchaseofitemswithitemnumber2;
	}

	public double calculatediscountonpurchaseofitemwithitemnumber2couponcodeanddifferentprice(boolean discountonpurchaseofitemwithitemnumber2andcouponcodeanddifferentprice) {
		bp.calculatePriceWhenDifferent();
		if(discountonpurchaseofitemwithitemnumber2andcouponcodeanddifferentprice==true){
			bp.totalprice-=calculatediscountonpurchaseofitemnumber2withcouponanddifferentprice();
		}
		return bp.totalprice;
	}

	private int calculatediscountonpurchaseofitemnumber2withcouponanddifferentprice() {
		int discountonitemwithitemnumber2couponcodeanddifferentprice=((discountrateonitem2+discountrate+Coupondiscountrate)*bp.totalprice)/100;
		return discountonitemwithitemnumber2couponcodeanddifferentprice;
	}

	public double calculatediscountonpurchaseofitem2anditem5(boolean discountonpurchaseofitem2anditem5) {
		bp.calculatePriceWhenDifferent();
		if(discountonpurchaseofitem2anditem5==true){
			bp.totalprice-=discountforpurchaseofitem2anditem5();
		}
		return bp.totalprice;
	}

	private int discountforpurchaseofitem2anditem5() {
		int discountpriceforitem2anditem5=(discountonitem2anditem5*bp.totalprice)/100;
		return discountpriceforitem2anditem5;
	}

	public double calculatediscountonitem2anditem5withcoupon(boolean discountonpurchaseofitem2anditem5withcoupon) {
		bp.calculatePriceWhenDifferent();
		if(discountonpurchaseofitem2anditem5withcoupon==true){
			bp.totalprice-=discountonpurchaseofitem2anditem5withcoupon();
		}
		return bp.totalprice;
	}

	private int discountonpurchaseofitem2anditem5withcoupon() {
		int discountforpurchaseofitem2anditem5withcoupon=((discountonitem2anditem5+Coupondiscountrate)*bp.totalprice)/100;
		return discountforpurchaseofitem2anditem5withcoupon;
	}

	public double calculatediscountonitem2anditem5withsameprice(boolean discountonpurchaseofitem2anditem5withsameprice) {
		bp.calculatetotalprice();
		if(discountonpurchaseofitem2anditem5withsameprice==true){
			bp.totalprice-=discountonpurchaseofitem2anditem5withsameprice();
		}
		return bp.totalprice;
	}

	private int discountonpurchaseofitem2anditem5withsameprice() {
		int discountonpurchaseofitem2anditem5withsameprice=(discountonitem2anditem5*bp.totalprice)/100;
		return discountonpurchaseofitem2anditem5withsameprice;
	}
	
}
