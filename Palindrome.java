
import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Cheack weather Palindrome or not");
		s = sc.nextLine();
		
		int i = 0;
		int j = s.length() - 1;
		int flag = 0;
		
		while(i<j && flag == 0)
		{
		    if(s.charAt(i)!= s.charAt(j))
		    {
		        flag = 1;
		    }
		    i++;
		    j--;
		    
		}
		if(flag == 0)
		{
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("Not PAlindrome");
		}
		
		
		
	}
}
