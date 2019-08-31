package by.htp.hw4.main;
/*
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
 * пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Task7 {

	public static void main(String[] args) {

		int[] mas = new int[] { 3, 4, 6, 5, 3, 7, 2, 9 };

		double x = getMaximumLength(mas);
		
		System.out.println("Максимальное расстояние: " + x);
	}

	public static double getMaximumLength(int[] mas) {

		double l1 = 0;
		
		double l2 = 0;
		
		double l3 = 0;
		
		double lMax = length(mas[0], mas[1], mas[2], mas[3]);

		for (int i = 0; i < mas.length - 2; i = i + 2) {
			
			l1 = length(mas[i], mas[i + 1], mas[i + 2], mas[i + 3]);
			
			for (int j = 0; j < mas.length - 2; j = j + 2) {
				
				l2 = length(mas[j], mas[j + 1], mas[j + 2], mas[j + 3]);

				if (l1 >= l2) {
					
					l3 = l1;

				} else {
					
					l3 = l2;

				}
				if (lMax >= l3) {

				} else {
					
					lMax = l2;

				}
			}
		}

		return lMax;
	}

	public static double length(int x1, int y1, int x2, int y2) {

		double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		return length;

	}

}
