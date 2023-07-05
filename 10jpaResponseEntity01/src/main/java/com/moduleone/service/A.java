package com.moduleone.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class A {

	public static void main(String[] args) {

		int a[] = { 1, 2, 7, 7, 3, 4, 5, 6, 7, 8, 8 };

		int i = Arrays.stream(a).boxed().sorted((o1, o2) -> o2 - o1).distinct().skip(1).findFirst().get();
		System.out.println(i);
		
//		int lar = 0;
//		int sec = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > lar) {
//				sec = lar;
//				lar = a[i];
//			} else if (sec < a[i] && a[i] != lar) {
//				sec = a[i];
//			}
//		}
//		System.out.println(lar);
//		System.out.println(sec);
	}

//		try {
//			System.out.println("1");
//			int s=5/0;
//		}catch(ArithmeticException a){
//			System.out.println("2");
//			System.exit(1);
//		}finally {
//			System.out.println("3");
//		}
//		System.out.println("4");
//	}

}
