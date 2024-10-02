package org.example;

public class DuplicateCharFromString {
    public static void main(String[] args)
    {
        String string1 = "Great responsibility";

          char []ch = string1.toCharArray();

        int count;
        for(int i=0;i<=ch.length-1;i++)
        {
            count=1;
            for(int j=i+1;j<=ch.length-1;j++)
            {
                if(ch[i]==ch[j] && ch[i]!=' ' && ch[j]!='0')
                {
                    count++;
                    ch[j]='0';
                }
            }
            if(count>1 && ch[i]!='0')
            {
                System.out.println("Duplicate characters " + ch[i]);
            }
        }
    }
}
