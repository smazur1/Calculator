import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number1;
		double number2;
		String m;
		int operator;
		String o;
		double result;
		String blank = "";

		Scanner keyboard = new Scanner(System.in);
		Operations math = new Operations();

		m = "What is the first number? : ";
		print(m);
		number1 = keyboard.nextDouble();

		m = "1 - Addition";
		print(m);
		m = "2 - Subtraction";
		print(m);
		m = "3 - Multipicaton";
		print(m);
		m = "4 - Division";
		print(m);
		m = "5 - Modulus";
		print(m);
		m = "What do you want to do? : ";
		print(m);
		operator = keyboard.nextInt();

		m = "What is the second number ? :";
		print(m);
		number2 = keyboard.nextDouble();
		print(blank);

		switch (operator) {
		case 1:
			o = " + ";
			result = math.addition(number1, number2);
			m = (number1 + o + number2 + " = " + result);
			print(m);
			break;
		case 2:
			o = " - ";
			result = math.subtraction(number1, number2);
			m = (number1 + o + number2 + " = " + result);
			print(m);
			break;
		case 3:
			o = " * ";
			result = math.multiplication(number1, number2);
			m = (number1 + o + number2 + " = " + result);
			print(m);
			break;
		case 4:
			o = " / ";
			if (number2 == 0.0) {
				m = "Division by Zero is invalid";
				print(m);
				break;
			} else {
				result = math.division(number1, number2);
				m = String.format(number1 + o + number2 + " = %.3f" + result);
				print(m);
				break;
			}
		case 5:
			o = " mod ";
			result = math.modulus(number1, number2);
			m = String.format(number1 + o + number2 + " = %.3f" , result);
			print(m);
			break;
		default:
			o = " Invalid Operator ";
			print(o);
			break;

		}
		

	}

	public static void print(String message) {
		System.out.println(message);

	}
}
