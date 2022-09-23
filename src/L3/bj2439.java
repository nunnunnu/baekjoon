package L3;

import java.util.Scanner;

public class bj2439 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			for(int k=0;k<(t-(i+1));k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
