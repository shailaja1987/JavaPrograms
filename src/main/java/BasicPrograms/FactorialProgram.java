package BasicPrograms;

public class FactorialProgram {
    public static void main(String[] args)
    {
        int i,fact=1;
        int num=5;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
