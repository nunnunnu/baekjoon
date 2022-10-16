package L7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10250 {

	public static void main(String[] args) throws IOException{
//		Scanner s = new Scanner (System.in);
//		int t=s.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = null;
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
//			int h=s.nextInt();
//			int w=s.nextInt();
//			int n=s.nextInt();
			token= new StringTokenizer(br.readLine());
			int h=Integer.parseInt(token.nextToken());
			int w=Integer.parseInt(token.nextToken());
			int n=Integer.parseInt(token.nextToken());
			
			int count=0;
			int floor=0;
			int room=1;
			while(count<n) {
				if(floor==h) {
					floor=0;
					room++;
				}
				floor++;
				count++;
			}
			System.out.print(floor);
			System.out.println(String.format("%02d",room));
		}
	}
}
