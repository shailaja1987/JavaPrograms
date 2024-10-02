package BasicPrograms;

public class Pattern3 {
    public static void main(String args[])
    {
        int num =5;
        for(int i=0;i<num;i++)
        {   for(int k=num-i;k>0;k--)
        {
            System.out.print(" ");
        }
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
