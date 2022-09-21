package L2;

import java.util.Scanner;

public class bj2525 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h=s.nextInt();
		int m=s.nextInt();
		int a=s.nextInt();
		h+=a/60;
		m+=a%60;
		if(m>=60) {
			h+=1;
			m%=60;
		}
		if(h>=24) {
			h-=24;
		}
		System.out.println(h+" " +m);
	}

}
