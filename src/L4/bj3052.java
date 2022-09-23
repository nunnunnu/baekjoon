package L4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj3052 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = s.nextInt()%42;
//		}
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			int test=0;
//			for(int j=i+1;j<arr.length;j++) {
//				if (arr[i] == arr[j]){
//					test++;
//				}
//			}
//			if (test == 0){
//				count++;
//			}
//		}
//		System.out.println(count);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[]= new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine())%42;
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int test=0;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i] == arr[j]){
					test++;
				}
			}
			if (test == 0){
				count++;
			}
		}
		System.out.println(count);
		
	}
}
