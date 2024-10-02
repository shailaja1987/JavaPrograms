package org.example;

public class changeCase {
    public static void main(String[] args)
    {
        String str="Great Power";
        StringBuffer newStr=new StringBuffer(str);
        for(int i=0;i<= str.length()-1;i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                newStr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                newStr.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
System.out.println(newStr);
    }
}
