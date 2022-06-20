package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double price(double dollar, double quantity) {
		double value = dollar * quantity;
		return value += value * IOF;
	}
	
	
	

}
