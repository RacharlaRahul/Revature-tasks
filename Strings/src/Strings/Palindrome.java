package Strings;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		String fina="";
		for(String x:arr) {
			fina=fina+isPallindrome(x)+" ";
		}
		System.out.println(fina);

	}
	static String isPallindrome(String s)
	{
		if(isP(s))
		{
			return s;
		}
		else
		{
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			return sb.toString();
		}
	}
	public static boolean isP(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();
		return s.equals(s1);
	}
}
