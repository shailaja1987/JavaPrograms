package org.example;

public class smallLargeWordInString {
    public static void main(String[] args)
    {
        String str="Hardships often prepare ordinary people for an extraordinary destiny";
        String[] strsplit=str.split(" ");
        String small=strsplit[0],large=strsplit[0];
        for(int i=0;i< strsplit.length;i++)
        {

                if(small.length()>strsplit[i].length())
                {
                    small=strsplit[i];

                }
            if(large.length()<strsplit[i].length())
                {
                    large=strsplit[i];
                }



        }
        System.out.println("small "+ small);
        System.out.println("Large "+ large);
    }
}
