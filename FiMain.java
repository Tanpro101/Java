import java.util.Scanner;

public class FiMain
{
	public static void main(String[] args)
	{
		int[][] a=new int[3][4];
		
		Scanner sin=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("Input Value["+i+"]["+j+"] :");
				a[i][j]=sin.nextInt();
			}
		}
		int max=a[0][0];
		int min=a[0][0];
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
			
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
					
			}

		}
		System.out.println("Maximum Value of array:"+max);
		System.out.println("Minimum Value of array:"+min);
		
	}
}






                                         

