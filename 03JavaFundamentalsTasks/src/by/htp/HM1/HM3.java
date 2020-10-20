package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM3 {
	public static void main(String[] args) {
		boolean b = true;
		int n = 0;
		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество элементов");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(1000);
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] > a[i + 1]) {
				b = false;
				break;
			}
		}if(b) {
			System.out.println("Возрастающая");
		}else {
			System.out.println("Не возрастающая");
		}
		
		
	}

}
