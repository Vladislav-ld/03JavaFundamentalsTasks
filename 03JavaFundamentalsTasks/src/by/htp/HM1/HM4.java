package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM4 {

	public static void main(String[] args) {
		int K = 2;
		int sum = 0;
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
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] % K == 0) {
				sum ++;
			}
		}
		
		System.out.println("Количество чисел кратных 2:" + sum);

	}

}
