package Array;

public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,234,35,7,19,87,90};
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
		}
		

	}
	static boolean isPrime(int a)
	{
		boolean b=true;
		if(a==2)
		{
			b=true;
		}
		else
		{
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				b=false;
				break;
			}
		}
		}
		return b;
	}


}
