package by.htp.hw4.main;
/*
 * 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого 
являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task15 {

	public static void main(String[] args) {		
        int k = 5;
		int n = 50;
		
		int[] mass = init(k,n);
		print(mass);
	}
	
		public static void print(int[] mas) {
			for (int i = 0; i < mas.length; i++) {
				System.out.println(mas[i]);
			}
		}
		
		public static int[] init(int k, int n) {
			int lenMas = 0;
			int counter = 0;
			for (int i = 0; i <= n; i++ ) {
				int sum = 0;
				int s = i;
			    while (( s * 1.0 / 10) >= 0.1) {
			    	sum = sum + (s % 10);
			    	s = (s / 10);	    	
			    }
			    
			    if (sum == k) {
			    	lenMas++;
			    }
			}
			int[] mass = new int[lenMas];
			for (int i = 0; i <= n; i++ ) {
				int sum = 0;
				int s = i;
			    while (( s * 1.0 / 10) >= 0.1) {
			    	sum = sum + (s % 10);
			    	s = (s / 10);	    	
			    }
			    
			    if (sum == k) {
			    	mass[counter] = i;
			    	counter++;
			    }
			}
			
			return mass;
		}

}
