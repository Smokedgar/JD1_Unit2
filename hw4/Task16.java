package by.htp.hw4.main;
/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти
и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
задачи использовать декомпозицию*/
public class Task16 {

	public static void main(String[] args) {

		int n = 1000;
		getTwins(n);
	}

	public static void getTwins(int n) {
		for (int i = n; (i + 2) <= 2 * n; i++) {
			if (findTruth(i) && findTruth(i + 2))
				System.out.println(i + " + " + (i + 2));
		}
	}

	public static boolean findTruth(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
