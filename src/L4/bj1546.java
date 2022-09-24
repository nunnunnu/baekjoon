package L4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj1546 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[s.nextInt()];
//		int max = 0;
//		float sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = s.nextInt();
//			if(arr[i]>max) max = arr[i];
//		}
//		for(int i=0;i<arr.length;i++) {
//			sum += (float)arr[i]/max*100f;
//		}
//		System.out.println((float)sum/arr.length);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		float sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += (float)arr[i]/arr[arr.length-1] *100;
		}
		System.out.println(sum/arr.length);
		
	}
}
