
public class Operations {

	private double number1;
	private double number2;

	public double multiplication(double num1, double num2) {
		double result;
		result = num1 * num2;
		return result;
	}

	public double addition(double num1, double num2) {
		double result;
		result = num1 + num2;
		return result;
	}

	public double subtraction(double num1, double num2) {
		double result;
		result = num1 - num2;
		return result;
	}

	public double division(double num1, double num2) {
		double result = 0;
		
		try {
		result = num1 / num2;
		} catch (ArithmeticException e) {
			e.getMessage();
		}
		return result;
	}
	
	public double modulus(double num1, double num2) {
		double result;
		result = num1 % num2;
		return result;
	}
}
