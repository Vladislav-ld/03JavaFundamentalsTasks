package by.htp.HM1;

import java.util.Random;
import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
		int s = 0;
		int n = 0;
		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество элементов");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Задайте массив");
		for(int i = 0; i < a.length; i++) {
			if(!sc.hasNextInt()) {
			sc.next();
			}
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				s++;
			}
		}
		
		int[] b = new int[s];
		
		for(int i = 0, j = 0; i < a.length; i++) {
			if(a[i] == 0) {
				b[j] = i;
				j++;
			}
		}
		
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
