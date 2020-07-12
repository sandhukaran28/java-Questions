package first1;

public class Selection {

	public static void main(String[] args) {
		int arr[]= {5,-1,0,3,2,1};
		int n=arr.length,i,j;
		for(i=0;i<n-1;i++)
		{
			int min=i;
			for(j=i;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
   for(int e: arr)
   {
	   System.out.print(e+" ");
   }
	}

}
