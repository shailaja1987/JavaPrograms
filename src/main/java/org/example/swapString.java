package org.example;

public class swapString {
    public static void main(String[] args)
    {
        String str1="Good";
        String str2="morning";
        //Concatenate both the string str1 and str2 and store it in str1
        str1 = str1 + str2;
        //Extract str2 from updated str1
        str2 = str1.substring(0, (str1.length() - str2.length()));
        //Extract str1 from updated str1
        str1 = str1.substring(str2.length());

        System.out.println("Strings after swapping: " + str1 + " " + str2);
    }
}
