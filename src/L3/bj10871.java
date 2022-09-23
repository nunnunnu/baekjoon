package L3;

import java.util.Scanner;

public class bj10871 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			int input = s.nextInt();
			if(input<x) System.out.print(input+" ");
		}
	}

}
