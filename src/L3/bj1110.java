package L3;

import java.util.Scanner;

public class bj1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int sum = 0;
		int count=0;
		int tmp = input;
		while(true) {
			sum= (tmp%10) + (tmp/10);
			tmp = (tmp%10)*10 + sum%10;
			count++;
			if(tmp==input) break;
		}
		System.out.println(count);
	}

}
