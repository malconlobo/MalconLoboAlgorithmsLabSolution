package com.greatlearning.services;

public class TransactService {

	public int checkTarget(int[] transactionArray, int target) {
		// TODO Auto-generated method stub
		int sum = 0; 
		for(int i = 0 ; i < transactionArray.length; i ++) {
		    sum = sum + transactionArray[i];
			if(sum >= target) {
				return i+1;
			}
		}
	    return -1;	
	}

}
