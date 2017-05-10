// @ AUTHOR:SHARAN

// WITH RESPECTIVE TO THE NAME OF THE QUESTION CLASS NAME IS DEFINED.

// This program will take input string and case sensitive, white space cases are considered.

// we are taking extra array of size 256 which can predict they are permutation of given string is permutation or not

// "tactcoa" --- "tacocat" -----> [output:this string makes plaindrome]

// "Tactcoa"------>[output:this dosent make palindrome because case sensitive cases are considered]

// "tact coa"---->[output:this string  makes palindrome because whitespace cases are considered]

// we can change condition in auxillary array so that all the above cases can be handled.

// time complexity-- O(m) -->[m:length of first string]

// space complexity--array size of 256

// ANY SUGGESTION IS ACCEPTED
import java.util.*;

class PalindromePermutation
{

   public static void main(String[] args)
   {
     System.out.println("************HI************");
     System.out.println("PLEASE ENTER A STRING TO CHECK WHETHER  ITS PERMUTATION IS PALINDROME OR NOT :");
     Scanner sc=new Scanner(System.in);
     String first=sc.nextLine();
     check(first);  // this will do the work for you
     System.out.println("************BYE************");

   }

   public static void check(String first)
   {

    int a[]=new int[256];
    int balance=0;                       // finds how many odd time repeated characters are present
    for(int i=0;i<first.length();i++)
    {
        a[(int)first.charAt(i)]++;
        if(a[(int)first.charAt(i)]%2!=0)  // this will find whether the no of characters are even or odd.
        {
            balance++;
        }
        else
        {
            balance--;
        }

    }

    if(balance==1 || balance==0)
    {
        System.out.println("yes the permutation of the given String is palindrome");
    }
    else
    {
        System.out.println("no the permutation of the string is not a palindrome");
    }

    return;

   }


}
