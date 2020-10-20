package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM8 {

	public static void main(String[] args) {
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
			a[i] = rand.nextInt(20);
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > i) {
				System.out.println(a[i] + " ");
			}
		}

	}

}
