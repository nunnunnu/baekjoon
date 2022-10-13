package L7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2292 {
	
	
	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		int n=s.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum=1;
//		for(int i=0;i<n;i++) {
//			sum+=i*6;
//			if(n<=sum) {
//				System.out.println(i+1);
//				break;
//			}
//		}
		int count=0;
		while(count<=n) {
			sum+=count*6;
			if(n<=sum) {
				System.out.println(count+1);
				break;
			}else count++;
		}
	}

}
