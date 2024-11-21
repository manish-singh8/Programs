package Strings;

//https://leetcode.com/problems/sorting-the-sentence/

public class StringSentenceSequence {
    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";
        String input[] = s.split(" ");
        int siz=input.length;
        String output[] = new String[siz];
        for (String i : input) {
            int v = i.charAt(i.length() - 1);
            System.out.println("Int value " + v);
            v=v-'0';
            System.out.println("Int value after " + v);
            output[v-1]=i.substring(0,i.length()-1);

        }
        String out="";
        for(String o:output)
        {
            out+=o;
            out+=" ";

        }
        System.out.println(out.trim());
    }

}
