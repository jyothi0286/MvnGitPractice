package com.mvn.spark.SalesTool;

public class Main {
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesData data = new SalesData();
		
				displayGreeting();
				data.display();
	}
	private static void displayGreeting() {
		System.out.println("hello happy sales people");
		System.out.println("this app shows sales data");
	}

}
