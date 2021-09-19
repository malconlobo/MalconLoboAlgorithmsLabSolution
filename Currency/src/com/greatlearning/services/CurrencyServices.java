package com.greatlearning.services;

public class CurrencyServices {

	public void getMinNotes(int[] currency, int amount) {
		int left = 0;
		int right = currency.length - 1;
		mergeSort(left, right, currency);
		getCombination(currency, amount);
	}

	public void getCombination(int[] currency, int amount) {
		// TODO Auto-generated method stub
		int notes;
		for (int i = 0; i < currency.length; i++) {
			if (amount > 0) {
				notes = amount / currency[i];
				amount = amount % currency[i];
				if (notes > 0) {
					System.out.println("Denomination : " + currency[i] + " Notes : " + notes);
				}
			}
		}
		if(amount > 0) {
			System.out.println("Denomination not found for remaining amount : " + amount);
		}
	}

	public void mergeSort(int left, int right, int[] currency) {
		if (left < right) {

			int mid = (left + right) / 2;
			mergeSort(left, mid, currency);
			mergeSort(mid + 1, right, currency);
			merge(left, mid, right, currency);
		}
	}

	public void merge(int left, int mid, int right, int[] currency) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = currency[left + i];
		}

		for (int i = 0; i < n2; i++) {
			rightArray[i] = currency[mid + 1 + i];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				currency[k] = leftArray[i];
				i++;
			} else {
				currency[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			currency[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			currency[k] = rightArray[j];
			j++;
			k++;
		}
	}

}