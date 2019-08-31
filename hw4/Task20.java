package by.htp.hw4.main;
/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Task20 {
public static void main(String[] args) {

	int a = 150;
	System.out.println(getCountSubtractions(a));		

}

public static int getCountSubtractions(int a) {

	int c = 0;
	while (a > 0) {
		int b = a;
		int sum = 0;
		sum = sum + (b % 10);
		b = b / 10;
		while (b > 0) {
			sum = sum + (b % 10);
			b = b / 10;				
		}
		a = a - sum;
		c++;
	}				
	return c;
}

}
