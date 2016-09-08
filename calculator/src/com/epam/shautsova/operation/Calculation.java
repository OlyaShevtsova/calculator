package com.epam.shautsova.operation;

import com.epam.shautova.model.Model;

public class Calculation {
	public static double sum(Model model) {
		return model.getFirstNumber() + model.getSecondNumber();
	}

	public static double subtract(Model model) {
		return model.getFirstNumber() - model.getSecondNumber();
	}

	public static double divide(Model model) {
		if (model.getSecondNumber() != 0) {
			return model.getFirstNumber() / model.getSecondNumber();
		} else {
			throw new RuntimeException("the second number can't be 0");
		}
	}

	public static double multiply(Model model) {
		return model.getFirstNumber() * model.getSecondNumber();
	}
}
