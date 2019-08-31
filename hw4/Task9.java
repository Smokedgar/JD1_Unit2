package by.htp.hw4.main;

/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task9 {

	public static void main(String[] args) {
		
		int x = 18;
		int y = 9;
		int z = 111;
		
		getSimple(x, y, z);		

	}

	public static void getSimple(int x, int y, int z) {
		
		int nod = 0;
		
		int min = Math.min( Math.min(x,y), z);	    
		
		for (int i = min; i > 0; i--) {
			
			if ((x % i == 0) && (y % i == 0) && (z % i == 0) ) {
				nod = i;
				break;
			}				
		}
		
		if (nod == 1) {
			System.out.println("Числа взаимно простые");
			} 
		else {
			System.out.println("Числа не взаимно простые");
		}
		

	}

}
