package Strings;

public class ReverseEachWord {
//output-siht si tnioptavaj
    public static void main(String[] args) {
        String input="this is javatpoint";
        String output="";
        String inputs[]=input.split(" ");
        for(String i: inputs)
        {
            StringBuilder rev=new StringBuilder(i);
            System.out.println("rev: "+rev);
            output+=String.valueOf(rev.reverse());
            System.out.println("rev.reverse: "+output);

            output+=" ";
        }
        output=output.trim();
        System.out.println("ExpectedOutput: "+output);


    }
}
