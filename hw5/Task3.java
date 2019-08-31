package by.htp.hw5.main;
/*
 * Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
 * отрицательное.
 */

public class Task3 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {-5, 55, 5, 555, 5555};
		
		getSign(mas);		
		
	}
	
	public static void getSign(int[] mas) {
		
		if (mas[0] > 0) {
			System.out.println("+");
		} else { 
			System.out.println("-");
			
		}
	}

}
