package ConsoleApp;

import java.util.Scanner;

//This program takes a number from user and generate spiral n*n square matrix
public class SpiralMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the square matrix one dimension : ");
		int dimension = scanner.nextInt();
		int[][] array = generateSpiralArray(dimension);
		printArray(array);

	}

	public static int[][] generateSpiralArray(int n) {
		int[][] array = new int[n][n];
		int numberOfSquare = (int) (Math.ceil(n / 2.0));
		int currentNumber = 1;
		int sideElement = n;
		// first for defines how many square is drawn
		for (int i = 0; i < numberOfSquare; i++) {

			// for top side
			for (int j = 0; j < sideElement; j++) {
				array[i][j + i] = currentNumber;
				currentNumber++;
			}
			// for right side
			for (int j = 1; j < sideElement; j++) {
				array[i + j][sideElement - 1 + i] = currentNumber;
				currentNumber++;
			}

			// for the bottom side
			for (int j = sideElement - 2; j > -1; j--) {
				array[sideElement - 1 + i][j + i] = currentNumber;
				currentNumber++;
			}

			// for the left side
			for (int j = sideElement - 2; j > 0; j--) {
				array[j + i][i] = currentNumber;
				currentNumber++;
			}
			sideElement -= 2;

		}

		return array;
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
		}
	}
}
