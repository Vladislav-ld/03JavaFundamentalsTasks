package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM7 {

	public static void main(String[] args) {
		int min;
		int max;
		int n;

		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество элементов");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(50);
		}
		
		min = a[0];
		max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
			if(a[i] > max) {
				max = a[i];
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == min) {
				a[i] = max;
			}else if(a[i] == max) {
				a[i] =  min;
			}
			System.out.print(a[i] + " ");
		}
		

	}

}
