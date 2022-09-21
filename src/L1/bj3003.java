package L1;

import java.util.Arrays;
import java.util.Scanner;

public class bj3003 {

	public static void main(String[] args) {
				  //킹,퀸,룩,비,나,폰
		int arr[] = {1,1,2,2,2,8};
		Scanner s = new Scanner(System.in);
		int Sarr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			Sarr[i]=s.nextInt();
		}
		int result[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			result[i] = arr[i]-Sarr[i];
			System.out.print(result[i]+ " ");
		}
	}

}
