// @ AUTHOR:SHARAN

// WITH RESPECTIVE TO THE NAME OF THE QUESTION CLASS NAME IS DEFINED.

// This program will take input as string and case sensitive criteria is neglected.

// "waterbottle" --- "erbottlewat" -----> [output:second string is the rotation of the first]


// time complexity---> its given in the book that we have to access the substring method only once, we dont bother internal implementaion of the substring method

// space complexity--we are adding the second string to itself to verify.

class StringRotation
{
    public static void main(String[] args)
    {
        System.out.println("*********HI*********");
        System.out.println("PLEASE ENTER TO STRINGS TO CHECK IF SECOND STRING IS ROATATION OF FIRST");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string :");
        String first=sc.nextLine();
        System.out.println("enter the second string");
        String second=sc.nextLine();
        isrotate(first,second);  // this function will do the work for you
        System.out.println("***********BYE***********");
    }


    public static void  isrotate(String first,String second)
    {
             // if we add second string twice i.e erbottlewat + erbottlewat --> erbottlewaterbottlewat which consists of original string waterbottle
             // by using this property we can say the result
             if(substring(first,second+second)) // we are accessing the substring method only once
             {
                System.out.println(second+" is the rotation of first " +first);
             }
             else
             {
                System.out.println(second+ " string is not the rotation of "+first);
             }
    }


// dont bother about this method it is already provided to you

    public static boolean substring(String first,String second)
    {
        return second.toLowerCase().contains(first.toLowerCase());
    }
}