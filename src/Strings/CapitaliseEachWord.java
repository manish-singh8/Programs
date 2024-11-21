package Strings;

public class CapitaliseEachWord {

    public static void main(String[] args) {
        String input="this is javatpoint";
        String output="";

        String inputs[]=input.split(" ");
        for(String s:inputs)
        {
            char ch[]=s.toCharArray();
            output+=Character.toUpperCase(ch[0]);
            for(int i=1;i<ch.length;i++)
            {
                output+=ch[i];
            }
            output+=" ";
        }
        output=output.trim();
        System.out.println(output);
    }
}
