package by.htp.hw4.main;

public class Task6 {

	public static void main(String[] args) {

		double s;
		s = getSquareHexagon(4);
		System.out.println("Площадь правильного шестиугольника: " + s);

	}

	public static double getSquareHexagon(int a) {

		double s = 2 * getSquareTriangle(a, a, a);
		return s;
	}
	public static double getSquareTriangle(int x, int y, int z) {

		double S;
		double p;

		p = (x + y + z) / 2;

		S = Math.sqrt(p * (p - x) * (p - y) * (p - z));

		return S;
	}
}
