package by.htp.hw4.main;
/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task18 {

public static void main(String[] args) {
		
		int n = 3;
	    
	    int a = (int)(Math.pow(10, n - 1));		 	    	    
	    int b = (int)(Math.pow(10, n));			
	    
	    findProgresion(a, b);
	}
	
	public static void findProgresion(int a, int b) {
		
		int x;
		int t = 10;
		boolean g = false;
		int j = 0;				
		
		for (int i = a; i < b; i++) {
			j = i;
			t = 10;
			
			while (j > 0) {
				x = j % 10;
				j = (j - x) / 10;
				if (x < t) {
					t = x;
					g = true;
				}
				else {
					g = false;
					break;
				}
			}
			if (g == true) {
				System.out.println(i);
			}
		}		
	}
}

