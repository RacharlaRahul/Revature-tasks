package Array;
import java.util.Arrays;

public class Duplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,33,22,45,22,22,47,47};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		removeDuplicates(arr);
		

	}
	static void removeDuplicates(int arr[])
	{
				int n= arr.length;
		if(n==0||n==1)
		{
			System.out.println(Arrays.toString(arr));
		}
		else
		{
			int j=0;
			for(int i=0;i<n-1;i++)
			{
				if(arr[i]!=arr[i+1])
				{
				  arr[j++]=arr[i];
				}
			}
			arr[j++]=arr[n-1];
			for(int i=0;i<j;i++)
			{
			System.out.print(arr[i]+" ");
			}
		}
	}


}
