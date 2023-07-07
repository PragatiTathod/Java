/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Armstrong
{
	public static void main(String[] args) {
		int count= 0;
		int z = 0;
		int sum = 0;
		int digit = 0;
		int num = 371;
		
		z = num;
		
		while(z > 0)
		{
		    count++;
		    z = z/10;
	    }
		z = num;
		while(z > 0)
		{
		    digit = z % 10;
		    int pro = 1;
		    for(int i = 1; i <= count; i++)
		    {
		        pro = pro * digit;
		        
		    }
		   sum = sum + pro;
		        z = z / 10;
		 }
		 if(sum == num)
	       {
		        System.out.println("Armstrong");
		   }
		   else
		    {
		        System.out.println("Not Armstrong");
		    }
	}
}
