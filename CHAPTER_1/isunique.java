// @ AUTHOR:SHARAN
// WITH RESPECTIVE TO THE NAME OF THE QUESTION CLASS NAME IS DEFINED.
// This program will take input string and case sensitive is considered.
// SHARAN--sharan--->[output: not unique strings, we considered case sensitive]
// we are taking extra array of size 256 which can predict any redundancy in string
// timecomplexity--O(n)-->[n is the string length]
// spacecomplexity--array size of 256.
import java.util.*;
class isunique{
   public static void main(String[] args)
   {
     System.out.println("************HI***************");
     System.out.println("Enter the string to check whether it is unique or not: ");
     Scanner sc=new Scanner(System.in);
     String isuniquestring=sc.next();
     checkunique(isuniquestring);
     System.out.println("************BYE*****************");
   }
   public static void checkunique(String isuniquestring)
   {
     int flag[]=new int[256];
     for(int i=0;i<isuniquestring.length();i++)
     {
     	if(flag[(int)isuniquestring.charAt(i)]==0)
     		flag[(int)isuniquestring.charAt(i)]=1;
     	else
     	{
     		System.out.println("not a unique string");
     		return;
     	}
     }
     System.out.println("it is a unique string");
   }
}
