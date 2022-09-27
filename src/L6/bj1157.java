package L6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj1157 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);	
//		String str = s.next().toUpperCase();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		char[] c = new char[26];
		for(int i=0;i<26;i++) {
			c[i] = (char) (65+i);
		}
		int arr[]= new int[26];
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<c.length;j++) {
				if(str.charAt(i)==c[j]) arr[j]+=1;
			}
		}
		char ch=' ';
		int max = 0;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>max) {
				max=arr[k];
				ch = (char) (k+65);
			}
			else if(arr[k]==max)
					ch='?';
		}
		System.out.println(ch);
	}

}
