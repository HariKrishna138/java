import java.util.*;
class bubbless
{
 public static void main(String[] args)
 {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array values:");
        for(int k=0;k<n;k++){
        a[k]=sc.nextInt();}
	int i,j,temp;
	//int a[]={4,5,7,2,3};
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{	
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		System.out.print(a[i]);
	}
}
}	
