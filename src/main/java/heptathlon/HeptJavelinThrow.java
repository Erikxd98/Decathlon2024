package heptathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class HeptJavelinThrow {

	private int score;
	private double A = 15.9803;
	private double B = 3.8;
	private double C = 1.04;
	private double minBoundaryValue = 0;
	private double maxBoundaryValue = 110;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in metres.
	public int calculateResult(double distance) {

		while (active) {

			try {
				// Acceptable values.
				if (distance < 0) {
					System.out.println("Value too low");
					score = -1;
					//distance = inputResult.enterResult();
				} else if (distance > 100) {
					System.out.println("Value too high");
					score = -2;
					//distance = inputResult.enterResult();

				} else {

					score = calc.calculateField(A, B, C, distance);
				}
				active = false;
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is: " + score);
		return score;
	}

}
