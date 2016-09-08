package com.epam.shautsova.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.epam.shautova.model.Model;
import com.epam.shautsova.operation.Calculation;

public class Main {
	public static void main(String... args) {
		boolean flag = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (!flag) {
			try {
				System.out.println("to exit enter 'exit', in other case type something");
				if ("exit".equals(reader.readLine())) {
					flag = true;
					break;
				}
				System.out.println("Enter the first number: ");
				double fisrtNumber = Double.parseDouble(reader.readLine());
				System.out.println("Enter the second number: ");
				double secondNumber;
				secondNumber = Double.parseDouble(reader.readLine());

				Model model = new Model(fisrtNumber, secondNumber);

				System.out.println("Choose operation: +, -, / or *");
				String operation = reader.readLine();

				switch (operation) {
				case "+":
					System.out.println("the result is " + Calculation.sum(model));
					break;
				case "-":
					System.out.println("the result is " + Calculation.subtract(model));
					break;
				case "/":
					System.out.println("the result is " + Calculation.divide(model));
					break;
				case "*":
					System.out.println("the result is " + Calculation.multiply(model));
					break;
				default:
					System.out.println("wrong operation");
					break;
				}
			} catch (NumberFormatException | IOException e) {
				System.out.println("something wrong");
			}
		}
	}
}
