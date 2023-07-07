/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Prime
{   
    
 public static void main(String args[])
 {    
  int i , m =0;
  int flag=0; 
  int n=29;
  
  m = n/2;  
  
  if(n == 0 || n == 1)
  {  
      System.out.println(n + " is not prime number");      
  }
  else
  {  
      for(i = 2; i <= m; i++)
   {      
    if(n % i == 0)
    {      
     System.out.println(n + " is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag == 0)  { System.out.println(n+" is prime number"); }  
  }  
}    
}   
