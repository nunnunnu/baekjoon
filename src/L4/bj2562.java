package L4;

import java.io.*;
import java.util.StringTokenizer;

public class bj2562 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[9];
//		int max = 0, count =0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=s.nextInt();
//			}
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//				count=i+1;
//			}
//		}
//		System.out.printf("%d%n%d",max,count);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
		for(int i =0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int max = 0, count =0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				count=i+1;
			}
		}
		System.out.printf("%d%n%d",max,count);
	}

}
