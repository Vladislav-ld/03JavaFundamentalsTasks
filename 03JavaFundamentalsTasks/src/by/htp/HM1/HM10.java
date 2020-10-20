package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM10 {
	public static void main(String[] args) {
		int max;
		int n;
		int i;
		int j;

	
		Random rand = new Random();
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Введите количество элементов");
		if(!sc.hasNextInt()) {
			sc.next();
			}
		n = sc.nextInt();
	
		int[] a = new int[n];

		int[] b = new int[n / 2];
	
		for(i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(50);
			System.out.print(a[i] + " ");
		}
	
		for(i = 0, j = 0; i < a.length / 2; i++) {	
			b[i] = a[i] + a[n - 1 - j];
			j++;
		}
		System.out.println(";");
		
		max = b[0];
	
		for(i = 0; i < b.length; i++) {
			if(b[i] > max) {
				max = b[i];
			}
			System.out.print(b[i] + " ");
		}
		System.out.println("Максимальный элемент " + max);
	}
}
