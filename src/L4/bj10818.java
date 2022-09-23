package L4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj10818 {

	public static void main(String[] args) throws IOException{
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int arr[] = new int[n];
//		
//		for(int i=0;i<arr.length;i++){
//			arr[i]= s.nextInt();
//		}
//		Arrays.sort(arr);
//		System.out.println(arr[0] +" " +arr[n-1]);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
	}

}
