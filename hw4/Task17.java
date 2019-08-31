package by.htp.hw4.main;
/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
 * в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать
 * декомпозицию.
 */

public class Task17 {

	public static void main(String[] args) {
		
		int k = 1567;
		getArmstrong(k);

	}
	
	public static void getArmstrong(int k) {
		double a;
		double sum = 0;
		
		for (int i = 1; i <= k; i++) {
			int j = i;
			int n = 0;
			while (j > 0) {
				a = j % 10;
				n++;
				sum = sum + a;
				j = j / 10;				
			}
			if (i == Math.pow(sum, n) )
			System.out.println(i);
						
			}
		}		
	}

