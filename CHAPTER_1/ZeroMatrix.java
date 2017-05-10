// @ AUTHOR:SHARAN

// WITH RESPECTIVE TO THE NAME OF THE QUESTION CLASS NAME IS DEFINED.

// "i love you" --- "iloveyou" -----> [output:these are not permutations to each other because we considered white space also.]

// time complexity-- O(n) -->[we are traversing the entire matrix once]

// space complexity--array[lr]+array[lc]-->[length of a row in matrix+ length of a column in matrix]



import java.util.*;
class ZeroMatrix
{
    public static void main(String[] args)
    {


        System.out.println("*********HI*********");
        System.out.println("PLEASE ENTER TO STRINGS TO CHECK IF THEY ARE ONE EDIT OR ZERO EDITS");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows=sc.nextInt();
        System.out.println("enter no of columns");
        int col=sc.nextInt();
        // this code is just to read the data of a matrix
        ArrayList<ArrayList<Integer>> matrix=new ArrayList();
        for(int i=0;i<rows;i++)
        {
             ArrayList<Integer> temp=new ArrayList();
             for(int j=0;j<col;j++)
             {
                System.out.println("please enter the element corresponding to matrix index["+(i+1)+"]["+(j+1)+"] :");
                temp.add(sc.nextInt());

             }
             matrix.add(temp);
        }

        changematrix(matrix);// this method will do the work for you
        System.out.println(matrix);


    }

    public static void changematrix(ArrayList<ArrayList<Integer>> matrix)
    {
        // we use auxillary arrays inorder to set values when we encounter zero.
        int rowflag[]=new int[matrix.size()];
        int colflag[]=new int[matrix.get(0).size()];

        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<matrix.get(0).size();j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    rowflag[i]=-1;
                    colflag[j]=-1;
                }
            }
        }


        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<matrix.get(0).size();j++)
            {
                if(rowflag[i]==-1 || colflag[j]==-1)
                {
                    matrix.get(i).set(j,0);
                }
            }
        }



    }
}