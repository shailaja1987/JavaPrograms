package BasicPrograms;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        int num=545;
        int temp,sum=0;
        temp=num;
        int r;
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("PalindromeNumber");
        }
    }
}
