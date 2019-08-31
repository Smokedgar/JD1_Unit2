package by.htp.hw5.main;
/*
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */

public class Task2 {

	public static void main(String[] args) {
		
		int k = 405704090;
		int mas[] = ZeroNumbers(k);
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]);
		}
	}
	
	public static int[] ZeroNumbers(int k) {
		
		int i = k;		
		int c = 0;
		int c1 = 0;
		int m, n;
		while(i > 0) {	
			m = i % 10;
			if (m == 0) {
				c++;
			}			
			i = i / 10;
			c1++;
		}
		int mas[] = new int[c];
		c--;
		c1--;		
		int j = k;
		while(j > 0) {
			n = j % 10;
			if (n == 0) {
				mas[c] = c1;
				c--;
			}			
			j = j / 10;
			c1--;
		}
		
		return mas;
	}

}
