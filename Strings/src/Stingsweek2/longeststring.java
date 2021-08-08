package Stingsweek2;
import java.util.Arrays;
import java.util.Scanner;


public class longeststring {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s =sc.nextLine();
	System.out.println(printHighest( s));
	}
	public static String printHighest(String s)
	{
	String arr[]=s.split(" ");
	int l=0;
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i].length()>l)
		{
			l=arr[i].length();
		}
		
	}
	String str="";
	for(int i=0;i<arr.length;i++)
	{
	 if(arr[i].length()==l)
	 {
		str=str+arr[i]+" ";
	 }
	}
	return str;
}

}
