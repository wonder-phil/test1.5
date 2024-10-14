package c;

public class TestMe {
	private double value = Double.NaN;

	public TestMe() {
		System.out.println("In constructor");
	}

	public double square() { return value*value; }
	public void setValue(double v) {
		value = v;
	}

}
