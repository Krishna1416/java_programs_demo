package com.java;

public class GFG {

	// Driver code
	public static void main(String args[]) {
		int arr[] = { 10, 13, 2, 4, 7, 6, 9, 8 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				if (arr[i] % 2 == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int k = 0; k < n; k++)
			System.out.print(arr[k] + " ");
	}
}
