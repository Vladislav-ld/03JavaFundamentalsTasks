package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM1 {

	public static void main(String[] args) {
		int K;
		int sum = 0;
		int n = 0;
		
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
		K = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(1000);
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] % K == 0) {
				sum +=a[i];
			}
		}
		
		System.out.println("Сумма чисел кратных K: " + sum);
	}

}
