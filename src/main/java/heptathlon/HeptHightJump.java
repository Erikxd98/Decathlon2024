package heptathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class HeptHightJump {

	private int score;
	private double A = 1.84523;
	private double B = 75;
	private double C = 1.348;
	private double minBoundaryValue = 0;
	private double maxBoundaryValue = 300;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in cenimeters.
	public int calculateResult(double distance) {

		while (active) {

			try {
				// Acceptable values in cm
				if (distance < 75.7) {
					System.out.println("Value too low");
					score = -1;
					//distance = inputResult.enterResult();
				} else if (distance > 270) {
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
