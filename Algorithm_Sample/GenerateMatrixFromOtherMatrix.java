package Arrayss;

import java.util.Scanner;

/* this program generates a array which consists sequence of line input until last line equals the only word
 * "end" . Then generates new array and new array elements generates by summing previous element of array with
 * its adjacent elements */
public class GenerateMatrixFromOtherMatrix {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String temp = "";
		String finalString = "";
		int dim = -1;
		System.out.println("Enter elements of matrix line by line and last line should be 'end' ");
		while (!("end".equals(temp))) {

			finalString = finalString + temp + " ";
			temp = scanner.nextLine();
			dim++;

		}
		scanner.close();
		scanner = new Scanner(finalString);
		int count = 0;
		while (scanner.hasNext()) {
			scanner.nextInt();
			count++;
		}
		scanner.close();
		int column = count / dim;
		int[][] array1 = new int[dim][column];
		scanner = new Scanner(finalString);
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = scanner.nextInt();

			}
		}
		int[][] array2 = new int[dim][column];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = array1[(i + 1 + dim) % dim][j] + array1[(i - 1 + dim) % dim][j]
						+ array1[i][(j + 1 + column) % column] + array1[i][(j - 1 + column) % column];
			}
		}
		scanner.close();
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");

			}
			System.out.println();
		}

	}

}
