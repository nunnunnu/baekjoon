package L6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj1316 {

	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
	public static boolean check() throws IOException {
		String st = br.readLine();
		boolean check[] = new boolean[26];
		int prev = 0;
		
		for(int i=0;i<st.length();i++) {
			int a = st.charAt(i);
			if(prev != a) {
				if(check[a-'a']==false) {
					check[a-'a']=true;
					prev = a;
				}else return false; //그룹단어가 아니라서 종료시킴
			}
		} 
		return true; //앞선 문자와 i번째 문자가 같다면 true
	}
	
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(br.readLine());
		int count =0;
		for(int i=0;i<n;i++) {
			if(check()==true) count++;
		}
		System.out.println(count);		
		
	}
	
}