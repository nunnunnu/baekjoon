package L5;

import java.util.Scanner;

public class bj1065 {
	static int a(int n) {
		int count=0;
		if(n<100) return n;
		else count=99;
		for(int i=100;i<=n;i++) {
			if((i/100)-(i/10)%10 == ((i/10)%10)-(i%10))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(a(s.nextInt()));
	}

}
