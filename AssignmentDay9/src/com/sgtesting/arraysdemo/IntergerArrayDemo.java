package com.sgtesting.arraysdemo;

public class IntergerArrayDemo {
	public static void main(String[] args) {

		Integer a[] = { 21, 22, 23, 24, 25, 26, 27, 28 };
		{
			int sum=0;
			for (int i = 0;i<= a.length - 1; i++) {
				sum=sum+a[i];
			}
			System.out.println("sum of the values are="+sum);

		}

	}

}
