package org.example;

public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        //Reverse String
        String s = new String(revStr("hello brave new world"));
        //Revrese String word by word
        String st = new String(revWords("hello brave new world"));
        //Revrese String word by word
        String sb = new String(revWordsotherway("hello brave new world"));
        //Reverse word from string
        String sb1 = new String(revWordsfromString("hello brave new world"));
        System.out.println(s);
        System.out.println(st);
        System.out.println(sb);
        System.out.println(sb1);
    }

    public static String revStr(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String revWords(String str) {
        StringBuilder sb = new StringBuilder();
        String revd = revStr(str);
        for (String s : revd.split(" ")){
            sb.append(revStr(s));
            sb.append(" ");
        }
        return sb.toString();
    }
    public static String revWordsotherway(String str) {
        StringBuilder sb = new StringBuilder();
        String revd[] = str.split(" ");
        for (int i=revd.length-1;i>=0;i--){
            sb.append(revd[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static String revWordsfromString(String str) {
        StringBuilder sb = new StringBuilder();
        String revd[] = str.split(" ");
        for (int i=0;i<=revd.length-1;i++){
            sb.append(revStr(revd[i]));
            sb.append(" ");
        }
        return sb.toString();
    }
}
