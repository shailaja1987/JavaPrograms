package org.example;

public class Vowels_consonants {
    public static void main(String[] args)
    {
        String str="This is a really simple sentence";
        int VCount=0;
        int CCount=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
            {
                VCount++;
            }
            else
                CCount++;
        }

        System.out.println("Vowel Count " +VCount);
        System.out.println("consonants Count " +CCount);

    }
}
