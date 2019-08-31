package by.htp.hw5.main;
/*
 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Task5 {

	public static void main(String[] args) {

		int mas[] = new int[] { 1, 2, 3, 4 };
		int mas1[] = getEvenMas(mas);
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}
	}
	public static int[] getEvenMas(int[] mas) {
		int с = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				с++;
			}
		}
		int mas1[] = new int[с];
		int k = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				mas1[k] = mas[i];
				k++;
			}
		}		
		if (с == 0) {
			System.out.println("Отсутствуют четные числа");
		}
		
		return mas1;
	}

}
