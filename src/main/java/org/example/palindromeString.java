package org.example;

public class palindromeString {
    public static void main(String[] args) {
        String str = "Kayak";
        str = str.toLowerCase();
        String RevreseString = "";
        StringBuffer newStr = new StringBuffer(str);
        String revStr = String.valueOf(newStr.reverse());
        if (str.equals(revStr)) ;
        {
            System.out.println("Given String is palindromeString");
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            RevreseString = RevreseString + str.charAt(i);

        }
        if(str.equals(RevreseString))
        {
            System.out.println("Given String is palindromeString");
        }
    }
}
