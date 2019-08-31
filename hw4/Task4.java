package by.htp.hw4.main;

/*
 * 4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
 */
public class Task4 {

	public static void main(String[] args) {
		int a = 50;
		int b = 25;
		int c = 75;
		nok(a, b, c);
	}

	public static void nok(int x, int y, int z) {
		int nod = 0;
		for (int i = 1; i < (x * y * z); i++) {
			if ((x % i == 0) && (y % i == 0) && (z % i == 0)) {
				if (i > nod) {
					nod = i;
				}
			}
		}
		System.out.println("Hаименьшее общее кратное = " + (x * y * z) / nod);
	}

}
