/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class PrintPrime
{
	public static void main(String[] args) {
		
		int num = 100;
		
		for(int i = 1; i <= num; i++)
		{
		    int count = 0;
		    for(int j = 1; j <= i; j++)
		    {
		        if(i % j == 0)
		        {
		            count++;
		        }
		        
		    }
		     if(count == 2)
		        {
		            System.out.println(i);
		        }
		   
        }
	
    }
}
