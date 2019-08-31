package by.htp.hw5.main;
import java.util.Random;
/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */
public class Task7 {

	public static void main(String[] args) {

		int a = 5;
		int z = 30;
		int mas[] = new int[a];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
			System.out.print(mas[i] + " ");
		}
		replaceHigherWithZ(mas, z);
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
	
	public static int[] replaceHigherWithZ(int mas[], int z) {
		int c = 0;
		for (int i = 0; i < mas.length; i++) {			
			if (mas[i] > z) {
				mas[i] = z;
				c++;
			}
		}		
		System.out.println(" ");
		System.out.print("замен - " + c);
		
		return mas;
	}

}
