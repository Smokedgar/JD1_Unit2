package by.htp.hw5.main;
/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task1 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {1, 2, 3, 6, 9, 12};		
		int k = 3;
		
		int sum = getSum(mas, k);		
		
		System.out.println(sum);			
	}
	
	public static int getSum(int[] mas, int k) {
		int sum = 0;
		for(int i = 0; i < mas.length; i++) {			
			if (mas[i] % k == 0) {				
				sum = sum + mas[i];
			}
		}
		return sum;
	}
}
