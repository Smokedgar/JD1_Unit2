package by.htp.hw4.main;

/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить
 * также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task19 {
public static void main(String[] args) {

	int n = 2;

	int a = (int) (Math.pow(10, (n - 1)));
	int b = (int) (Math.pow(10, n));

	int y = getOdd(a, b);
	System.out.println(y);

	int z = getEven(y);
	System.out.println("Четных цифр - " + z);
}
public static int getOdd(int a, int b) {

	int sum = 0;
	int x;
	boolean g;
	for (int i = a; i < b; i++) {
		int j = i;
		g = false;
		while (j > 0) {

			x = j % 10;

			if (x % 2 != 0) {
				g = true;
			} 
			if (x % 2 == 0) {
				g = false;
				break;
			}
			j = j / 10;
		}
		if (g == true) {
			sum = sum + i;
		}
	}
	return sum;
}

public static int getEven(int y) {

	int c = 0;
	int x;
	while (y > 0) {

		x = y % 10;
		
		if (x % 2 == 0) {
			c++;
		} 
		y = y / 10;
	}
	return c;

}

}
