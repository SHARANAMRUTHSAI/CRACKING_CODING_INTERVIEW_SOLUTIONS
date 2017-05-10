// @ AUTHOR:SHARAN

// WITH RESPECTIVE TO THE NAME OF THE QUESTION CLASS NAME IS DEFINED.

// This program will take input string and case sensitive is considered.

// time complexity--O(n)---> [n:length of the input string]

// space complexity--we are creating a new string with worst case double the length of the input string
import java.util.*;
class StringCompression
{
    public static void main(String[] args)
    {
        System.out.println("*********HI*********");
        System.out.println("PLEASE ENTER TO STRINGS TO CHECK IF THEY ARE ONE EDIT OR ZERO EDITS");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String first=sc.nextLine();
        compress(first); // this method will do the work for you
        System.out.println("************BYE****************");
    }


// this function will do the compression of the string
    public static void compress(String first)
    {
         StringBuilder answer=new StringBuilder("");
         int count=1;

         // if the string is length of 1 then it should be handled separately.
         if(first.length()==1)
         {
            answer.append(first.charAt(0));
            answer.append(count);
            System.out.println(answer.toString());
            return;
         }
         // this piece of code helps you to handle all the strings with the length above 1
         for(int i=0;i<first.length()-1;i++)
         {
            if(first.charAt(i)==first.charAt(i+1))
            {
               count++;
            }
            else
            {
                answer.append(first.charAt(i));
                answer.append(count);
                count=1;

            }
            // this condition helps when you have a string in which last character is different i.e "aabbccdde" and in normal case too "aabbcccdd"
            // it switches with respective to last character in the string.
            if(i==first.length()-2)    ///
            {
                    answer.append(first.charAt(i+1));
                    answer.append(count);
            }

         }
         System.out.println(answer.toString()); // converting to string is optional
    }


}