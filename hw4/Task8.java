package by.htp.hw4.main;
import java.util.Random;

/*
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task8 {

	public static void main(String[] args) {

		int n = 4;
		getSecondMax(n);
	}
	
	public static void getSecondMax(int n) {

		int[] mas = new int[n];
		Random rand = new Random();
		int max = 0;
		int s = 0;
		System.out.print("Массив состоит из чисел: ");
		for (int i = 0; i < mas.length; i++) {			
			mas[i] = rand.nextInt();
			if (mas[i] > max) {
			    s = max;
			    max = mas[i];
			} else if (mas[i] > s) {
			    s = mas[i];
			}
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		System.out.println("Второе по величине значение: " + s);

	}

}
