package org.example;

public class ReverseString{

    public static void main(String[] args)
    {
        String OrgString="Hello World";
        String ReverseString="";
        for(int i=OrgString.length()-1;i>=0;i--)
        {
            ReverseString=ReverseString+OrgString.charAt(i);
        }

        System.out.println("Reverse String "+ ReverseString);
    }


}