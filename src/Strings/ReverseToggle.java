package Strings;

public class ReverseToggle {
    //Expected-sIHT sI tNIOPTAVAJ
    public static void main(String[] args) {
        //ReverseEachWord
        String input="this is javatpoint";
        String output="";
        String inputs[]=input.split(" ");
        for(String i: inputs)
        {
            StringBuilder rev=new StringBuilder(i);
            //System.out.println("rev: "+rev);
            output+=String.valueOf(rev.reverse());
            //System.out.println("rev.reverse: "+output);

            output+=" ";
        }
        output=output.trim();
        System.out.println("ReverseEachWordOutput: "+output);
        //ReverseToggle
        inputs=output.split(" ");
        String output2="";
        for(String i: inputs)
        {
            char ch[]=i.toCharArray();
            output2+=ch[0];
            for(int j=1;j<ch.length;j++)
            {

                output2+=Character.toUpperCase(ch[j]);
            }
            output2+=" ";

        }
        System.out.println("ReverseToggleOutput: "+output2.trim());

    }
}

