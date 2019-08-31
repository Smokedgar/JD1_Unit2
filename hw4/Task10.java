package by.htp.hw4.main;

/*
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task10 {

	public static void main(String[] args) {

		int a = 9;
		System.out.println(getFactorial(a));

	}

	public static int getFactorial(int a) {

		int sum = 0;

		for (int i = 1; i <= a; i++) {

			if (i % 2 != 0) {
				int res = 1;
				
				for (int j = 1; j <= i; j++) {
					res = res * j;

				}
				sum = sum + res;
			}
		}
		
		return sum;

	}

}
