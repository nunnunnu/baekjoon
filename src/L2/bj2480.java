package L2;

import java.util.Scanner;

public class bj2480 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a==b && b==c) System.out.println(10000+a*1000);
		else if(a==b || b==c || a==c) {
			int same =a;
			if(b==c) same = b;
			System.out.println(1000+same*100);
		}
		else {
			int max =a;
			if(max<b) max = b;
			if(max<c) max =c;
			System.out.println(max*100);
		}
	}

}
