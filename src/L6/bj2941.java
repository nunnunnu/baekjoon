package L6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2941 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		String str = s.next();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		int count=0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)=='c' && i<str.length()-1) {
//				if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-') {
//					i++;
//				}	
//			}else if(str.charAt(i)=='d' && i<str.length()-1) {
//				if(str.charAt(i+1)=='-') {
//					i++;
//				}else if(str.charAt(i+1)=='z' && i<str.length()-2 && str.charAt(i+2)=='=') {
//					i+=2;
//				}
//			}else if((str.charAt(i)=='l' || str.charAt(i)=='n') && i<str.length()-1) {
//				if(str.charAt(i+1)=='j') {
//					i++;
//				}
//			}else if((str.charAt(i)=='s' || str.charAt(i)=='z' ) && i<str.length()-1) {
//				if(str.charAt(i+1)=='=') {
//					i++;
//				}
//			}
//			count++;
//		}
//		System.out.print(count);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arr[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int i=0;i<arr.length;i++) {
			if(str.contains(arr[i])) {
				str=str.replace(arr[i], "*");
			}
		}
		System.out.println(str.length());
		
		
	}

}
