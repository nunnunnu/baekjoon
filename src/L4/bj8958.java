package L4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj8958 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		String arr[] = new String[s.nextInt()];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = s.next();
//		}
//		for(int i=0; i<arr.length;i++) {
//			int sum=0;
//			int count=0;
//			for(int j=0;j<arr[i].length();j++) {
//				if(arr[i].charAt(j) =='O') count++;
//				else count =0;
//				sum+=count;
//			}
//			System.out.println(sum);
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = new String[Integer.parseInt(br.readLine())];
		for(int i=0;i<arr.length;i++) {
			arr[i] = br.readLine();
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0,count=0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') count++;
				else count=0;
				sum+=count;
			}
			System.out.println(sum);
		}
	}

}
