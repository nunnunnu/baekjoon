package L6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2908 {
	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		String str1 = s.next();
//		String str2 = s.next();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = br.readLine().split(" ");
//		String a="";
//		String b="";
//		for(int i=str.length;i>=0;i--) {
//			a += String.valueOf(str[0].charAt(i));
//		}
//		for(int i=str.length;i>=0;i--) {
//			b += String.valueOf(str[1].charAt(i));
//		}
//		int a2=Integer.parseInt(a);
//		int b2=Integer.parseInt(b);
//		
//		System.out.println(a2>b2?a:b);
		
//		Scanner in = new Scanner(System.in);
//        
//		int a = in.nextInt();
//		int b = in.nextInt();
//        
//        in.close();
//        
//		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
//		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
//		
//		System.out.print(a > b ? a : b);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
        int a=0;
        int b=0;
		a = Integer.parseInt(new StringBuilder(token.nextToken()).reverse().toString());
		b = Integer.parseInt(new StringBuilder(token.nextToken()).reverse().toString());
		
		System.out.print(a > b ? a : b);
	}
}