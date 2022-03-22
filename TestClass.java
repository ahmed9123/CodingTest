package testPackage;

public class TestClass {

	public static void main(String[] args) {
		
		int x=50;
		int a = 5;
		int counter = 0;
	
		
		for(int i = 1; i<x || i==x; i++ )
		{
			if (i % a == 0)
			{			
				System.out.println(i);
			}
		counter=i;
		}
		
		
		for(int j = counter; j<2*x || j==2*x; j++ )
		{
			if (j % (a+1) == 0 )
			{				
				System.out.println(j);
			}
		counter=j;
		}
		
		for(int k = counter; k<=3*x || k==3*x; k++ )
		{
			if (k % (a+2) == 0 )
			{
				
				System.out.println(k);
			}
		counter=k;
		}


	}
}
	


