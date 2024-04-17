package program;

import exception.IllegalOperationException;

public class Calculator_Conundrum {

	private int operator1;
	private int operator2;
	private String calc;

	public Calculator_Conundrum() {
	}

	public Calculator_Conundrum(int operator1, int operator2, String calc) {
		super();
		this.operator1 = operator1;
		this.operator2 = operator2;
		this.calc = calc;
	}

	public void calculate(int operador1, int operador2, String calc) {
		
		if (!calc.equals("+") && !calc.equals("-") && !calc.equals("*") && !calc.equals("/")) {
		    throw new IllegalArgumentException("Operation " + calc + " does not exist!");
		}
		if(calc.isEmpty()) {
			throw new IllegalArgumentException("Operation cannot be empty");
		}
		
		try {
		int result;
		if (calc == "+") {
			result = operador1 + operador2;
			System.out.println(result);
		}
		if (calc == "-") {
			result = operador1 - operador2;
			System.out.println(result);
		}
		if (calc == "*") {
			result = operador1 * operador2;
			System.out.println(result);
		}
		if (calc == "/") {
			result = operador1 / operador2;
			System.out.println(result);
		}
		} catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed");
        }
		
	}
}
