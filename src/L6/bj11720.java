package L6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11720 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		int n=s.nextInt();
//		String a = s.next();
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			sum+=a.charAt(i)-'0';
//		}
//			
//		System.out.println(sum);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum=0;
		for(byte value : br.readLine().getBytes()) {
			sum+= value-'0';
		}
			
		System.out.println(sum);
	}

}
