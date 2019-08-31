package by.htp.hw4.main;

/*
 * Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
 */
public class Task5 {

	public static void main(String[] args) {
		int a = 12;
		int b = 56;
		int c = 98;
		sum(a, b, c);
	}

	public static void sum(int x, int y, int z) {		
		int min = 0;
		int max = 0;
		
		if (x > y && x > z) {
			max = x;
		}
		if (y > x && y > z) {
			max = y;
		}
		if (z > x && z > y) {
			max = z;
		}
		if (x < y && x < z) {
			min = x;
		} else if (y < x && y < z) {
			min = y;
		} else {
			min = z;
		}
		System.out.println(max + min + " - Сумма наименьшего и наибольшего");
	}

}
