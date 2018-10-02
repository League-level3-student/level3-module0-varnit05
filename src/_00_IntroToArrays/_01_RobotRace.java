package _00_IntroToArrays;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] bob = new Robot[5];
		// 3. use a for loop to initialize the robots.
		int spacex = 170;
	
		for (int i = 0; i < bob.length; i++) {
			bob[i] = new Robot
			bob.setX(i * spacex);
			bob.setY(500);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		for (int i = 50; i < bob.length; i++) {
			rob.move(bob.length);
			
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		boolean finished = false; 
		while (!finished) {
		}
			
		}

	}
