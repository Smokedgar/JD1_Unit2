package by.htp.hw4.main;

/*
 * 3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 45;
		int c = 100;
		int d = 5;

		nod(a, b, c, d);
	}

	public static void nod(int x, int y, int o, int z) {
		int nod = 0;
		for (int i = 1; i < x * y * z * o; i++) {

			if ((x % i == 0) && (y % i == 0) && (o % i == 0) && (z % i == 0)) {

				if (i > nod) {
					nod = i;
				}
			}
		}
		System.out.println(nod);
	}

}
