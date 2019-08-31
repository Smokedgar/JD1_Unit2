package by.htp.hw5.main;
/*
 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
 */

public class Task4 {

	public static void main(String[] args) {

		int mas[] = new int[] { 1, 2, 3};
		isIncreasing(mas);
	}

	public static void isIncreasing(int mas[]) {
		boolean g = false;
		for (int i = 0; i < (mas.length - 1); i++) {
			if (mas[i] < mas[i + 1]) {
				g = true;
			} else {
				g = false;
				break;
			}
		}
		if (g == true) {
			System.out.println("возрастающая");
		} else {
			System.out.println("не возрастающая");

		}
	}

}
