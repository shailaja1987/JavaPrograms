package org.example;

public class SwapStringTemp {

    public static void main(String[] args)
    {
        String str1="Good";
        String str2="morning";
        String temp;
        temp=str1;
        str1=str2;
        str2=temp;
        System.out.println("Strings after swapping: " + str1 + " " + str2);
    }
}
