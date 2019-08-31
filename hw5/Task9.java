package by.htp.hw5.main;

import java.util.Random;

/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task9 {

	public static void main(String[] args) {

		int n = 5;
		int mas[] = new int[n];
		Random rand = new Random();		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt();			
			System.out.print(mas[i] + " ");
		}
		swapMaxMin(mas);		
		for (int i = 0; i < mas.length; i++) {					
			System.out.print(mas[i] + " ");
		}
	}
	
	public static int[] swapMaxMin(int mas[]) {
		int max = mas[0];
		int min = mas[0];
		int a = 0;
		int b = 0;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				a = i;
			}
			if (mas[i] < min) {
				min = mas[i];
				b = i;
			}			
		}
		System.out.println(" ");
		System.out.println("Максмальный элемент - " + max);
		System.out.println(" Минимальный элемент - " + min);
		
		mas[a] = min;
		mas[b] = max;
		return mas;
	}

}
