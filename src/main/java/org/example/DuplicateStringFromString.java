package org.example;

public class DuplicateStringFromString {
    public static void main(String[] args)
    {
        String str="Big black bug bit a big black dog on his big black nose";
        str=str.toLowerCase();
        String[] strsplit=str.split(" ");
        int count;
        for(int i=0;i<= strsplit.length-1;i++)
        { count=1;
            for(int j=i+1;j<=strsplit.length-1;j++)
            { //System.out.println(strsplit[i]);
                //System.out.println(strsplit[j]);
                if(strsplit[i].equals(strsplit[j]) && strsplit[j]!="0")
                {
                    count++;
                    strsplit[j]="0";
                }
            }
            if(count>1 && strsplit[i]!="0")
            {
                System.out.println("duplicate string "+ strsplit[i]);
            }
        }
    }
}
