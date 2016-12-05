package ex;

import java.util.*;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021031 孟京澤
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		float n = src.nextInt();

		if (n <= 120) {
			System.out.println(n * 2.1);
			System.out.println(n * 2.1);
		} else {
			if (n <= 330) {
				System.out.println(120 * 2.1 + (n - 120) * 3.02);
				System.out.println(120 * 2.1 + (n - 120) * 2.68);
			} else {
				if (n <= 500) {
					System.out.println(120 * 2.1 + 210 * 3.02 + (n - 330) * 4.39);
					System.out.println(120 * 2.1 + 210 * 2.68 + (n - 330) * 3.61);
				} else {
					if (n <= 700) {
						System.out.println(120 * 2.1 + 210 * 3.02 + 170 * 4.39 + (n - 500) * 4.97);
						System.out.println(120 * 2.1 + 210 * 2.68 + 170 * 3.61 + (n - 500) * 4.01);
					} else {
						System.out.println(120 * 2.1 + 210 * 3.02 + 170 * 4.39 + 200 * 4.97 + (n - 700) * 5.63);
						System.out.println(120 * 2.1 + 210 * 2.68 + 170 * 3.61 + 200 * 4.01 + (n - 700) * 4.5);
					}
				}
			}
		}

	}

}
