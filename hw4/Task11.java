package by.htp.hw4.main;
import java.util.Random;

/*
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Task11 {

	public static void main(String[] args) {
		Random rand = new Random();	
		int n = 6;
		int[] mas = new int[n];
		System.out.print("Массив: ");
		for (int i = 0; i < mas.length; i++) 
		{			
			mas[i] = rand.nextInt(5);
			System.out.print(mas[i] + ", ");
		}
		getSum(1, 3, mas);
		getSum(3, 5, mas);
		getSum(4, 6, mas);
	}		

	public static int getSum(int k, int m, int[] mas) {
		
		int sum = 0;

		for (int i = k-1; i <= m-1; i++) {			
			sum += mas[i];
			
		}
		System.out.println('\n' + "Сумма от " + k + " до " + m + " = " + sum);
		
		return sum;
	}

}
