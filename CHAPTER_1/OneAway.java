// @ AUTHOR:SHARAN

// WITH RESPECTIVE TO THE NAME OF THE QUESTION CLASS NAME IS DEFINED.

// This program will take input string and case sensitive, white space cases are considered.

// time complexity-- O(length of the smallest string it can be m or n) -->[m:length of first string,n:length of second string]



import java.util.*;
class OneAway
{
    public static void main(String[] args)
    {
        System.out.println("*********HI*********");
        System.out.println("PLEASE ENTER TO STRINGS TO CHECK IF THEY ARE ONE EDIT OR ZERO EDITS");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string :");
        String first=sc.nextLine();
        System.out.println("enter the second string");
        String second=sc.nextLine();
        validate_edits(first,second); // this method will do the work for you
        System.out.println("************BYE****************");
    }

    public static void validate_edits(String first,String second)
    {
         int edits=0;
         if(Math.abs(first.length()-second.length())>1)
         {
            System.out.println("more than 1 edit");   // if the difference in length is more than 1 no need to check further
            return;
         }
         else
         {
            int i=0;
            int j=0;
            while(i!=first.length() && i!=second.length())   // check either of the strings end is reached
            {

                if((int)first.charAt(i)-(int)second.charAt(j)!=0)
                {
                    edits++;
                    if(first.length()>second.length())
                    {
                        i++;
                    }
                    else if(first.length()<second.length())
                    {
                        j++;
                    }
                    else
                    {
                        i++;j++;
                    }
                }
                else
                {
                    i++;j++;
                }
                if(edits>1)
                {
                  System.out.println("more than 1 edit");   // during the verification process if more than 1 edit is found then return here itslef which reduces complexity
                  return;
                }


            }

            if(edits==0)
            {
                if(first.length()==second.length()) // even edits are zero if the lengths are not same i.e "pale" and "pales"
                {
                   System.out.println("zero edits");
                }
                else
                {
                    System.out.println("one edit");
                }
                return;
            }
            else
            {
                System.out.println("one edit");
                return;
            }
         }


    }
}