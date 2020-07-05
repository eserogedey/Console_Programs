package ConsoleApp;

import java.util.Scanner;
// this program find closest pair of point from given a set of points on coordinate plane.

public class FindNearstPoint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  number of points");
		int numberOfPoints = scanner.nextInt();
		int p1 = 0;
		int p2 = 1;
		System.out.println("Enter " + numberOfPoints + " points: ");
		double[][] points = new double[numberOfPoints][2];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = scanner.nextDouble();

			}
		}
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (distance < shortestDistance) {
					shortestDistance = distance;
					p1 = i;
					p2 = j;
				}
			}
		}
		System.out.println("The closest two points are " + "( " + points[p1][0] + ", " + points[p1][1] + " )" + " and "
				+ "( " + points[p2][0] + ", " + points[p2][1] + " )");

	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}
