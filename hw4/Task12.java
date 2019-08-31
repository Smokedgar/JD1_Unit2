package by.htp.hw4.main;
/*
* 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
* вычисления его площади, если угол между сторонами длиной X и Y— прямой.
*/
public class Task12 {

	public static void main(String[] args) {
		int x = 6;
		int y = 8;
		int z = 10;
		int t = 5;
		
		System.out.println(getSquare(x, y, z, t));
	}
	
	static double getSquare(int x, int y, int z, int t) {
		
		double s1 = x * y / 2;
		double a = Math.sqrt(x*x + y*y);
		double p = (z + t + a) / 2;
		double s2 = Math.sqrt(p*(p - z)*(p - t)*(p - a));
		double S = s1 + s2;
		return S;
	}
}
