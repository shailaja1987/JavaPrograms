package org.example;

public class freqCharFromString {
    public static void main(String[] args)
    {
        String s="picture perfect";
        char[] strchar=s.toCharArray();
        int[] freq=new int[s.length()];

        for(int i=0;i<strchar.length;i++)
        {
            freq[i]=1;
            for(int j=i+1;j<strchar.length;j++)
            {
                if(strchar[i]==strchar[j] && strchar[j]!='0' && strchar[i]!=' ')
                {
                    freq[i]++;
                    strchar[j]='0';
                }
            }
          // System.out.println("Charcater"+strchar[i] +"-" +freq[i]);
        }
        for(int k=0;k< strchar.length;k++)
        {
            if(strchar[k]!='0' && strchar[k]!=' ')
            {
                System.out.println("Charcater "+strchar[k] +"-" +freq[k]);
            }
        }
    }
}
