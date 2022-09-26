package L6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj10809 {

	public static void main(String[] args) throws IOException {
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			char arr[] = new char[26];
			for(int i=0;i<arr.length;i++) {
				arr[i]= (char) (97+i);
			}
			String str = br.readLine();
			for(int i=0;i<arr.length;i++) {
				System.out.print(str.indexOf(arr[i])+" ");	
		}
	}

}
