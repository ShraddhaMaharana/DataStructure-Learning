package com.main.mathematical;

public class EachDigitInANumber {

	public static void getEachDigit(int num) {
		int mod;
		while(num!=0) {
			mod = num%10;
			System.out.println(mod+"---"+num);
			num = num/10;
		}
	}
	
	public static void getEachDigitUsingRecusiveCall(int num) {
		if(num!=0) {
			System.out.println(num%10);
			getEachDigitUsingRecusiveCall(num/10);
		}
	}
	
	public static void main(String[] args) {
		getEachDigit(234);
		getEachDigitUsingRecusiveCall(9805);
	}

}
