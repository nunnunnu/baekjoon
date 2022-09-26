package L6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2675 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		for(int i=0;i<n;i++) {
//			int r = s.nextInt();
//			String str = s.next();
//			for(int k=0;k<str.length();k++) {
//				for(int j=0;j<r;j++) {
//					System.out.print(str.charAt(k));
//				}
//			}
//			System.out.println();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String input[] = br.readLine().split(" "); //공백기준으로 분리해서 input[0]에 r을, input[1]에 str을 받음
			int r = Integer.parseInt(input[0]);
			String str = input[1];
			for(int k=0;k<str.length();k++) {
				for(int j=0;j<r;j++) {
					System.out.print(str.charAt(k));
				}
			}
			System.out.println();
		}
	}

}
