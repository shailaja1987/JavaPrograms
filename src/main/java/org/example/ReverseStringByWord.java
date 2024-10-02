package org.example;

public class ReverseStringByWord {
    public static void main(String[] args)
    {
        String Org="I am Shailaja";
        String Reverse="";
        String str[]=Org.split(" ");
        for(int i=str.length-1;i>=0;i--)
        {
            Reverse=Reverse+str[i]+ " ";
        }
        System.out.println("Reverse String by Word " +Reverse);
    }
}
