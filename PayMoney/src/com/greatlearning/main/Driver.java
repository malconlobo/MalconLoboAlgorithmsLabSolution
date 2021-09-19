package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.services.TransactService;

public class Driver {

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		size = sc.nextInt();
		int[] transactionArray = new int[size];
		for (int i = 0; i < transactionArray.length; i++) {
			System.out.println("Enter the values of array");
			transactionArray[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTarget = sc.nextInt();
		for (int i = 0; i < noOfTarget; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			TransactService transact = new TransactService();

			int noOfTransactions = transact.checkTarget(transactionArray, target);
			if (noOfTransactions != -1) {
				System.out.println("Target achieved after " + noOfTransactions + " transactions");
			} else {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();
	}

}
