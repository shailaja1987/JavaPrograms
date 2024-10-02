package BasicPrograms;

public class PrimeNumber {
    public static void main(String[] args)
    { int m,flag=0;
        int num=13;
        m=num/2;
        System.out.println(m);
        for(int i=2;i<m;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not Prime");
                flag=1;
                break;
            }

        }
        System.out.println("Numer is Prime");
    }
}
