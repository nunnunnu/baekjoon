package L7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(token.nextToken());
		int B = Integer.parseInt(token.nextToken());
		int V = Integer.parseInt(token.nextToken());
//		Scanner s = new Scanner(System.in);
//		int A=s.nextInt();
//		int B=s.nextInt();
//		int V=s.nextInt();
		int x=0;
//		while(x<V) {
//			x+=A;
//			count++;
//			if(x<V) {
//				x-= B;
//			}
//			else {
//				break;
//			}
//		} // 시간초과 뜸
//		for(int i=0;x<V;i++) {
//			x+=A;
//			if(x<V) x-=B;
//			else {
//				i++;
//				System.out.println(i);
//				break;
//			}
//		} //시간 초과
		
		int count=0;
		count = (V-B)/(A-B);
		if((V-B)%(A-B) != 0) {
			count++;
		}
		
		System.out.println(count);
	}

}
