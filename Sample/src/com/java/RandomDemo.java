package com.java;

import java.util.Random;

public class RandomDemo {
	
	public static String generateRandomNumber(int charLength) {
		return String.valueOf(charLength < 1 ? 0
				: new Random().nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
						+ (int) Math.pow(10, charLength - 1));
	}

	public static void main(String[] args) {

		System.out.println("SO-"+generateRandomNumber(5));
		System.out.println("SO-"+generateRandomNumber(2));
		System.out.println("SO-"+generateRandomNumber(1));
		System.out.println("SO-"+generateRandomNumber(4));
	
		
	}

}
