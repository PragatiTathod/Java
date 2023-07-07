/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class BubbleSort
{
    static void sort(int[] arr)
	    {
	        int i, j ,temp = 0;
    	    for(i = 0; i < arr.length; i++)
    	    {
    	        for(j = 1; j < arr.length - i ;j++)
    	        {
    	            if(arr[j-1]> arr[j])
    	            {
    	                temp = arr[j-1];
    	                arr[j-1] = arr[j];
    	                arr[j] = temp;
    	            } 
    	        }
    	    }
	    }
	    
	public static void main(String[] args) {
	    int arr[] = {7,8,4,3,6,5,2,9,1,0};
	    
	    
	    sort(arr);
	    
	    for(int c = 0; c< arr.length; c++)
    	    {
    	        System.out.print(arr[c]);
    	    }
	    
	    
	   
    }
}
