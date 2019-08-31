package by.htp.hw4.main;
/*
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task14 {

	public static void main(String[] args) {

		int a = 111111;
		int b = 11111;
		
		getCount(a, b);
	}

	public static void getCount(int a, int b) {
		int c1 = 0;
		int c2 = 0;	
		while (a > 0) {						
			a = a / 10;
			c1 ++;
		}
		
		while (b > 0) {			
			b = b / 10;
			c2 ++;			
		}
		
		if (c1 > c2) {
			System.out.println("В первом числе больше цифр");	
		} 
		if (c2 > c1) {
			System.out.println("Во втором числе больше цифр");
		} 
		if (c1 == c2) {
			System.out.println("количество цифр равно");
		}

	}

}
