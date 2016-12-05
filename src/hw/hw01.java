package hw;

import java.util.*;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
		int b = src.nextInt();
		int c = src.nextInt();

		if (a >= 60 && b >= 60 && c >= 60) {
			System.out.print("P");
		} else if ((a < 60 && b >= 60 && c >= 60) || (a >= 60 && b < 60 && c >= 60) || (a >= 60 && b >= 60 && c < 60)) {
			if(a+b>=220 && b+c>=220 && a+c>=220)
			{
				
			}
		}
	}

}

//
//通過  				60+ 60+ 60+/60+ 60+ 60- +=220
//未通過				esle
//可補考			60+ 60+ 60- +=220 /60- 60- 80+