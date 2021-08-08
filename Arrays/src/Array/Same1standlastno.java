package Array;

public class Same1standlastno {
	public static void main(String [] args)
	{
		int arr[]= {1,2,3,101,304,567,899678};
		for(int i=0;i<arr.length;i++)
		{
			if(isLastAndFirstDigitSame(arr[i])!=true)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	static boolean isLastAndFirstDigitSame(int a)
	{
		boolean b=false;
		String s=a+"";
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			b=true;
		}
		return b;
	}
}
