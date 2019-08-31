package by.htp.hw5.main;
import java.util.Random;

/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
 * простыми числами.
 */

public class Task12 {
	static int a;
	static boolean b;

	public static void main(String[] args) {
		
		int n = 5;
		int mas[] = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(55);
			System.out.print(mas[i] + " ");
		}
		int sum = getSimpleSum(mas);
		System.out.println(sum);
	}

	public static int getSimpleSum(int mas[]) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			a = 2;
			b = false;
			if ((i+1 != 1) && checkIfIsSimple(i + 1)) {
				sum = sum + mas[i];
			}
		}
		System.out.println(" ");
		return sum;
	}

	public static boolean checkIfIsSimple(int i) {

		if (i % a != 0) {
			a++;
			checkIfIsSimple(i);
		} 
		if (i % a == 0) {

			if (a == i) {
				b = true;
			} 
			else {
				b = false;
			}
		}
		return b;
	}

}
