package hw;

import java.util.*;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int data[] = new int[4];
		int max = 0;
		for (int i = 0; i < 4; i++) {
			data[i] = src.nextInt();
		}
		int a = data[0];
		int b = data[1];
		int c = data[2];
		int d = data[3];
		if (a == b || a == c || a == d || b == c || b == d || c == d) {
			for (int i = 0; i < 4; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
			System.out.print(max * 2);
		} else {
			System.out.print("R");
		}
	}
}