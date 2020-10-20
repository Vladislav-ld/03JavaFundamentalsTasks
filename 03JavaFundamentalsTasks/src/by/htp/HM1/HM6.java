package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM6 {

	public static void main(String[] args) {
		int z;
		int n;
		int c = 0;

		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество элементов");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		System.out.println("Введите число");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		z = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(20);
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > z) {
				a[i] = z;
				c++;
			}
			System.out.println(a[i] + " ");
		}
		
		System.out.println("Количество замен " + c);

	}

}
