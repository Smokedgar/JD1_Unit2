package by.htp.hw5.main;

import java.util.Random;

/*
 * Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
 */

public class Task11 {

	public static void main(String[] args) {
		
		int n = 5;
		int l = 5;
		int m = 2;
		int mas[] = new int[n];
		Random rand = new Random();		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(55);			
			System.out.print(mas[i] + " ");
		}
		System.out.println(" ");		
		getNumbers(mas, l, m);		
	}
	
	public static void getNumbers(int mas[], int l, int m) {
		
		int c = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % m == l) {
				System.out.print(mas[i] + " ");
				c++;
			}					
		}
		if (c == 0) {
			System.out.println("нет таких элементов");
		}
		
	}

}
