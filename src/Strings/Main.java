package Strings;

public class Main {
//    Input: abc
//    Output: aaabbcbbaaa
//
//    Input: abcd
//    Output:
//    Aaaabbbccdccbbbaaaa


    public static void main(String[] args) {
        String input="abc";
        String output="";
        int j=0;
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            while(j<input.length())
            {
                output+=c;
                j++;
            }
            j=i+1;

        }
        j=2;
        int k=0;
        for(int i=input.length()-2;i>=0;i--)
        {
            k=0;
            char c=input.charAt(i);
            while(k<j && j!=input.length()+1)
            {
                output+=c;
                k++;
            }
            j=j+1;


        }
        System.out.println(output);

    }
}