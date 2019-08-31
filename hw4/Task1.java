package by.htp.hw4.main;

	/*
	 * 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
	 */

public class Task1 {

	public static void main(String[] args) {

		double square;
			square = getSquare(1, 3, 5, -4, 5, -2);
			System.out.println("Площадь треуголльника: " + square);

	}

	public static double getSquare(int x1, int y1, int x2, int y2, int x3, int y3) {

		double a;
		double b;
		double c;
		double P;
		double S;
		double p;

		a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
		b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow(y1 - y3, 2));
		c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow(y3 - y2, 2));
		P = a + b + c;
		p = P / 2;
		S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return S;
		}
}
