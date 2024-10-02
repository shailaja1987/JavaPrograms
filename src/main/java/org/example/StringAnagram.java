package org.example;
import java.util.Arrays;
//Two Strings are called the anagram if they contain the same characters.
public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "Grab";
        String str2 = "Brag";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length() != str2.length())
        {
           System.out.println("not anagram");
        }
        char[] strchar1=str1.toCharArray();
        char[] strchar2=str2.toCharArray();
       Arrays.sort(strchar1);
       Arrays.sort(strchar2);
        if(Arrays.equals(strchar1, strchar2) == true) {
            System.out.println("Both the strings are anagram");
        }
        else {
            System.out.println("Both the strings are not anagram");
        }

    }

}
