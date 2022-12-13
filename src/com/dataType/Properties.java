package com.dataType;

public class Properties {

	public void getMemorySizes() {
		System.out.println("Size of Byte in Bytes:  " + Byte.SIZE / 8);
		System.out.println("Size of short in Bytes:  " + Short.SIZE / 8);
		System.out.println("Size of int in Bytes:  " + Integer.SIZE / 8);
		System.out.println("Size of long in Bytes:  " + Long.SIZE / 8);
		System.out.println("Size of float in Bytes:  " + Float.SIZE / 8);
		System.out.println("Size of double in Bytes:  " + Double.SIZE / 8);
	}

	public void getMinMaxValues() {

		System.out.println("Byte Min Value: " + Byte.MIN_VALUE + " Max Value: " + Byte.MAX_VALUE);
		System.out.println("Short Min Value: " + Short.MIN_VALUE + " Max Value: " + Short.MAX_VALUE);
		System.out.println("int Min Value: " + Integer.MIN_VALUE + " Max Value: " + Integer.MAX_VALUE);
		System.out.println("Long Min Value: " + Long.MIN_VALUE + " Max Value: " + Long.MAX_VALUE);
		System.out.println("Float Min Value: " + Float.MIN_VALUE + " Max Value: " + Float.MAX_VALUE);
		System.out.println("Double Min Value: " + Double.MIN_VALUE + " Max Value: " + Double.MAX_VALUE);
	}

}
