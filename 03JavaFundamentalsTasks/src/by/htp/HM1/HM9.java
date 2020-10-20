package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM9 {
	public static void main(String[] args) {
		int n;
		int d = 0;
		int b = 0;
		int c = 0;

		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество элементов");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(200)-100;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				d++;
			}else  if(a[i] == 0 ) {
				b++;
			}else {
				c++;
			}
		}
		System.out.println("Количество отрицательных элементов " + d);
		System.out.println("Количетсво нулевых элементов " + b);
		System.out.println("Количетсво положительных элементов " + c);

	}

}
