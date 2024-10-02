package org.example;

public class CountChars {

    public static void main(String[] args)
    {
        String str="The best of both worlds";
        int count=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }

        }
        System.out.println("Count of chars from string" + count);
    }
}
