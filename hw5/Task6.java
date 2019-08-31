package by.htp.hw5.main;
import java.util.Random;
/*
 * Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
 */
public class Task6 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = 3;
		int mas[] = new int[a];		
		for (int i = 0; i < mas.length; i++) {
			mas[i]= rand.nextInt(100);			
		}
		int len = getLength(mas);		
		System.out.println(len);		
	}
	
	public static int getLength(int mas[]) {
		
		int max = mas[0];
		int min = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		
		int len = max - min;
		
		return len;
	}


}
