package L4;

import java.util.Arrays;
import java.util.Scanner;

public class bj4344 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c= s.nextInt();
		for(int i=0;i<c;i++) {
			float avg=0;
			int sum=0;
			int count=0;
			int arr[] = new int[s.nextInt()];
			for(int j=0;j<arr.length;j++) {
				arr[j] = s.nextInt();
				sum+=arr[j];
			}
			avg=(float)sum/arr.length;
			for(int k=0;k<arr.length;k++) {
				if(arr[k]>avg) count++;
			}
			System.out.printf("%.3f%%%n",(float)count/arr.length *100);
		}
	}

}
