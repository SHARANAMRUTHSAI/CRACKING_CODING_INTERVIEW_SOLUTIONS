// @ AUTHOR:SHARAN

// WITH RESPECTIVE TO THE NAME OF THE QUESTION CLASS NAME IS DEFINED.

// This program will take input string and case sensitive is considered.

// we are taking extra array of size 256 which can predict they are permutations of each other or not

// "i love you" --- "iloveyou" -----> [output:these are not permutations to each other because we considered white space also.]


// time complexity-- O(m+n) -->[m:first string,n:second string]

// space complexity--array size of 256

// ANY SUGGESTION IS ALWAYS ACCEPTED.
import java.util.*;

class checkpermutation
{

   public static void main(String[] args)
   {
   	System.out.println("*********HI*********");
    System.out.println("PLEASE ENTER TO STRINGS TO CHECK WHETHER IF ONE IS PERMUTATION OF OTHER OR NOT");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first string :");
    String first=sc.nextLine();
    System.out.println("enter the second string");
    String second=sc.nextLine();
    checkpermutation(first,second); // this method will do the work for you
    System.out.println("************BYE****************");


   }

   public static void checkpermutation(String first,String second)
   {


    if(first.length()!=second.length())
    {
        System.out.println("strings dosent satisify the permutation property");
        return;
    }

     int a[]=new int[256];

     for(int i=0;i<first.length();i++)
     {
        a[(int)first.charAt(i)]++;
     }

     for(int j=0;j<second.length();j++)
     {

        if(a[(int)second.charAt(j)]==0)
        {
            System.out.println("strings dosent satisify the permutation property");
            return;
        }
        else
        {
           a[(int)second.charAt(j)]--;
        }

     }

     System.out.println("one is permutation of the other");

   }




}
