package by.htp.hw5.main;

import java.util.Random;

/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */

public class Task8 {

	public static void main(String[] args) {
		
		int a = 5;
		int mas[] = new int[a];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt();		
			System.out.print(mas[i] + " ");
		}
		
		getcount(mas);	
	}
	
	public static void getcount(int mas[]) {
		
		int c0 = 0;
		int cpol = 0;
		int cotr = 0;
		for (int i = 0; i < mas.length; i++) {			
			if (mas[i] > 0) {				
				cpol++;
			} 
			if (mas[i] < 0) {				
				cotr++;
			} 
			if (mas[i] == 0) {				
				c0++;
			} 			
		}
		System.out.println(" ");
		System.out.println("положительных - " + cpol);
		System.out.println("нулевых - " + c0);
		System.out.println("отрицательных - " + cotr);
	}

}
