package org.example;

public class MaxMinOccuranceChar {
    public static void main(String[] args)
    {
        String str = "grass is greener on the other side";
        //Converts given string into character array
        char strchar[]=str.toCharArray();
        int[] freq=new int[str.length()];
        char minchar=str.charAt(0);
        char maxchar=str.charAt(0);
        int i, j, min, max;
        //Count each char in given string and store in array freq
        for(i=0;i<strchar.length;i++) {
            freq[i] = 1;
            for (j=i+1;j<strchar.length;j++)
            {
                if(strchar[i]==strchar[j] && strchar[i]!=' ' && strchar[j]!='0' )
                {
                    freq[i]++;
                    //Set string[j] to 0 to avoid printing visited character
                    strchar[j]='0';
                }

            }
        }
        min=max=freq[0];
        for(i=0;i< freq.length-1;i++)
        {
            //If min is greater than frequency of a character
            //then, store frequency in min and corresponding character in minChar
            if(min>freq[i] && freq[i]!='0')
            {
                   min=freq[i];
                   minchar=strchar[i];
            }
            //If max is less than frequency of a character
            //then, store frequency in max and corresponding character in maxChar
            if(max < freq[i] && freq[i]!='0') {
                max = freq[i];
                maxchar = strchar[i];
            }
        }



      System.out.println("Minimum occurring character: " + minchar);
      System.out.println("Maximum occurring character: " + maxchar);
}
}
