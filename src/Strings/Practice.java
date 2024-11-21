package Strings;

public class Practice {
    static String p="Initials";

    public static void main(String[] args) {
        String output="";
        for(int i=p.length()-1;i>=0;i--)
        {

            output+=p.charAt(i);

        }
        System.out.println("Reverse is: "+output);

        StringBuilder builder= new StringBuilder("Naman");
        StringBuilder p2=builder.reverse();
        if(p2.equals(builder))
        {
            System.out.println("Pqllindrome");
        }
    }
}
