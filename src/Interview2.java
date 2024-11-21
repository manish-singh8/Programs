public class Interview2 {

    public static void main(String[] args) {
        String input="I am a boy";
        //ip="I am a boy"
        //op"y ob a maI"
        String output="";
        char ch[]=input.toCharArray();
        String op2="";
        String op1="";
       String op[]=input.split(" ");
       for(String i:op)
       {
           output+=i;
       }
       for(int i=output.length()-1;i>=0;i--)
       {
           op2+=output.charAt(i);
       }
       int j=0;
       for(int i=0;i<input.length();i++)
       {
           if(ch[i]==' ')
           {
            op1+=" ";
            continue;
           }
           op1+=op2.charAt(j);
           j++;

       }
    System.out.println(op1);
    }
}
