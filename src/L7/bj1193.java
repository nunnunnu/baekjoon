package L7;

import java.util.Scanner;

public class bj1193 {

	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int sum=1;
		int tmp=0;
		
		while(tmp<x) {
			tmp+=sum;
			sum++;
		}
		int top=0;
		int bot=0;
		if(sum%2==0) {
			top=tmp-x+1;
			bot = sum-top;
		}else {
			bot=tmp-x+1;
			top=sum-bot;
		}
		System.out.println(top+"/"+bot);
	}
}
