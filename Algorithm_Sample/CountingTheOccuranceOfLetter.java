package ConsoleApp;
//Program generates 100 lowercase letter randomly.Then count the occurances of each letter in  the array.

public class CountingTheOccuranceOfLetter {
	public static void main(String[] args) {
		System.out.println("The lowercase letter are: ");
		char[] arrays = createArray(100);
		displayArray(arrays);
		System.out.println();
		System.out.println("The occurrences of each letter are : ");
		int[] count = countLetters(arrays);
		displayCounts(count);

	}

	public static char[] createArray(int n) {
		char[] array = new char[n];
		for (int i = 0; i < array.length; i++) {

			array[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
		}
		return array;
	}

	public static void displayArray(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.println(chars[i]);
			} else {
				System.out.print(chars[i] + " ");
			}
		}
	}

	public static int[] countLetters(char[] chars) {

		int[] counts = new int[26];
		for (int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++;
		}
		return counts;

	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0) {
				System.out.println(counts[i] + " " + (char) (i + 'a'));
			} else {
				System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
			}
		}

	}
}
