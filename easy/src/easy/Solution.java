package easy;

import javax.naming.spi.DirStateFactory.Result;
import javax.security.auth.x500.X500Principal;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWord(" I am a student"));

	}
	public static String reverseWord(String str){
		String [] stringArray = str.split(" ");
		StringBuilder res = new StringBuilder();
		for(String x :stringArray ){
			StringBuilder mid = new StringBuilder(x);
			res = res.append(" "+mid.reverse());
		}
		res.delete(0, 1);
		String result = res.toString();
		return result;
		
	}
}
