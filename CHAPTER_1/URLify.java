// @ AUTHOR:SHARAN
// WITH RESPECTIVE TO THE NAME OF THE QUESTION CLASS NAME IS DEFINED.
// This program will take input as a string.
// it replaces the white spaces in the string with "%20"
// we are using stringbuilder because the complexity string builder takes is very less when comapred to string.
// since strings are immutable in java using only strings and appending them in your program affects your efficency drastically.
// timecomplexity--O(n)-->[n is the string length]
// space complexity-- we are creating a new string it depends on the white spaces present in the string. minimum is size of your string i.e n


import java.util.*;
class URLify
{

   public static void main(String[] args)
   {
      System.out.println("****************HI*****************");
      System.out.println("THIS PROGRAM WILL HELP YOU TO CONVERT THE WHITESPACES IN THE STRING WITH '%20' ");
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter the string which you want to convert:");
      String urlify=sc.nextLine();
      replacewhitespaces(urlify);
      System.out.println("************BYE*****************");
   }

   public static void replacewhitespaces(String urlify)
   {
      StringBuilder answer=new StringBuilder("");
      String replace="%20"; // this is static with which we want to replace
      int flag=0;           // this will help us to find did we encountered any white space or not
      for(int i=0;i<urlify.length();i++)
      {
        if((int)urlify.charAt(i)==32)
            flag=1;
        else
        {
            if(flag==1)  // we have encountered the white space so far
            {
                                                // if we have encountered only white space so far then dont append the replace string this is checked
                 if(answer.length()!=0)         // with the help of calculating the length of our answer.
                  answer.append(replace);

                answer.append(urlify.charAt(i));
                flag=0;                          // flag is set so that we had took action with respective to white space so far covered.
            }
            else
              answer.append(urlify.charAt(i));
        }
      }
      System.out.println(answer.toString());  // converting from StringBuilder to String this is optional
   }
}
