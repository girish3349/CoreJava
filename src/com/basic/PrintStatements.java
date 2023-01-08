package com.basic;

public class PrintStatements {

	public static void main(String[] args) {
		/** there are 3 Print statements 
		 * print
		 * printf
		 * println
		 * **/
		
		System.out.println("Hello There");
		System.out.println("How are you");
		System.out.printf("We are now in %d of month %s ", 2023, "Jan");
		
		
		
		// Error Statements which will be displayed in red.
		System.err.println();
		System.err.println("Hello There");
		System.err.println("How are you");
		System.err.printf("We are now in %d of month %s", 2023, "Jan");
	}

}
