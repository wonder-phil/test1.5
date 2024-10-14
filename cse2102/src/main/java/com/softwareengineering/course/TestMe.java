package com.softwareengineering.course;

public class TestMe {
	private double value = Double.NaN;

	public static void main(String[] args) {
		System.out.println("in TESTME ");
	}

	public TestMe() {
		System.out.println("In constructor");
	}

	public double square() { return value*value; }
	public void setValue(double v) {
		value = v;
	}

}
