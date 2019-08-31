package by.htp.hw4.main;
/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
 */

public class Task2 {

	public static void main(String[] args) {

		int nod;
		nod = nod(66, 56);
		System.out.println("Наибольший общий делитель: " + nod);
		int nok;
		nok = nok(36, 60);
		System.out.println("Наименьшее общее кратное: " + nok);

	}

	public static int nod(int a, int b) {
		int del1;
		int del2;
		int nod = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				del1 = i;
				for (int j = 1; j <= b; j++) {
					if (b % j == 0) {
						del2 = j;
						if (del1 == del2) {
							nod = del1;
						}
					}
				}
			}
		}
		return nod;
	}

	public static int nok(int a, int b) {

		int _nok = (a * b) / nod(a, b);
		return _nok;
	}


}
