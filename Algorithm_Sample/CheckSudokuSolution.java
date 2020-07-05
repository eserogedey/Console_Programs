package ConsoleApp;

/*The program is to check whether a given 9*9 Sudoku solution is correct. */
import java.util.Scanner;

public class CheckSudokuSolution {
	public static void main(String[] args) {
		int[][] grid = readASolution();
		System.out.println(isValid(grid) ? "Valid Solution " : "Invalid Solution");

	}

	public static int[][] readASolution() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sudoku puzzle solution");
		int[][] grid = new int[9][9];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = scanner.nextInt();
			}
		}
		return grid;

	}

	/* This method check each cell must be number from 1 to 9 */
	public static boolean isValid(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] < 1 || grid[i][j] > 9 || !(isValid(i, j, grid))) {
					return false;
				}
			}

		}

		return true;
	}

	/* This method check every row ,column and small box has numbers from 1 to 9 */
	public static boolean isValid(int i, int j, int[][] grid) {
		for (int column = 0; column < 9; column++) {
			if (column != j && grid[i][j] == grid[i][column]) {
				return false;
			}
		}
		for (int row = 0; row < 9; row++) {
			if (row != i && grid[i][j] == grid[row][j]) {
				return false;
			}
		}
		for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
			for (int column = (j / 3) * 3; column < (j / 3) * 3 + 3; column++) {
				if (!(row == i && column == j) && grid[i][j] == grid[row][column]) {
					return false;
				}
			}
		}

		return true;
	}
}
