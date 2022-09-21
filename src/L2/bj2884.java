package L2;

import java.util.Scanner;

public class bj2884 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		m-=45;
		if(m<0) { 
			m+=60;
			if(h==0) {
				h=23;
			}else {
				h -=1;
			}
		}
		System.out.println(h+" "+m);
	}
}
