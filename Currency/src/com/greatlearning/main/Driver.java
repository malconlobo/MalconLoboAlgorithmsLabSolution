package com.greatlearning.main;

import java.util.Scanner;	
import com.greatlearning.services.*;

public class Driver {
	
	public static void main(String[] args) {
		
		int size;
		int[] currencyDenomination;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();
		currencyDenomination = new int[size];
		for (int i = 0; i < currencyDenomination.length; i++) {
			System.out.println("Enter the currency denominations value");
			currencyDenomination[i] = sc.nextInt();
			while(currencyDenomination[i] == 0) {
				System.out.println("Please enter valid denomination");
				currencyDenomination[i] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the amount to pay");
		int amountToPay = sc.nextInt();
		
		CurrencyServices currencyServices = new CurrencyServices();
		currencyServices.getMinNotes(currencyDenomination,amountToPay);
		sc.close();
	}

}
