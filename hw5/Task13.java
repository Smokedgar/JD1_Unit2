package by.htp.hw5.main;
import java.util.Random;

/*
 * Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
 * промежутке от L до N.
 */

public class Task13 {
	
	public static void main(String[] args) {
		int l = 5;
		int n = 10;
		int m = 2;

		int mas[] = new int[n];
		Random rand = new Random();		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);			
			System.out.print(mas[i] + " ");
		}
		
		int c = findNumbers(mas, l, m, n);	
		System.out.println(" ");
		System.out.println(c);	
	}
	
	public static int findNumbers(int mas[], int l, int m, int n) {
		int c = 0;
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m == 0) && (i > l) && (i < n)) {
				c++;
			}					
		}
		
		return c;
	}
}
