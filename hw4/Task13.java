package by.htp.hw4.main;
/*
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */
public class Task13 {

	public static void main(String[] args) {
		int n = 567498;
		getMas(n);
	}
	public static int[] getMas(int n) {

		int a;
		int b;		
		int lenMas = 0;
		int m = n;

		System.out.println(n);
		while (n > 0) {
			a = n % 10;			
			n /= 10;
			lenMas++;
		}
		int i = lenMas-1;
		int[] mas = new int[lenMas];

		while (m > 0) {			
			b = m % 10;
			mas[i] = b;
			System.out.print(mas[i] + " ");
			m /= 10;
			i--;			
		}
		return mas;
	}

}
