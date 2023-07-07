/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Fibonacci
{
	public static void main(String[] args) {
	    
	    int c = 0;
	    int k = 0; 
	    int d = 1;
	    int n = 10;
	    
	    System.out.println(c);
	    System.out.println(d);
	    
	    for(int i = 0; i <= n; i++)
	    {
	        k = c + d; 
	        System.out.println(k);
	        c = d;
	        d = k;
	        k = c;
	        
	        
	    }
	 
	}
}
