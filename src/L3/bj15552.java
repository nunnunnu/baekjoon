package L3;

import java.io.*;
import java.util.StringTokenizer;

public class bj15552 {
	public static void main(String[] arg) throws IOException {
//		Scanner s = new Scanner(System.in);
//		int t=s.nextInt();
//		for(int i=0;i<t;i++) {
//			int a=s.nextInt();
//			int b=s.nextInt();
//			System.out.println(a+b);
//		}
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(bf.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(bf.readLine());
			//a값 뒤에 오는 token을 기준으로 데이터 나누기
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
			bw.flush();
			bw.close();
	}

}
