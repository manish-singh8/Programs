package Strings;

public class StringOutput {
    // String s="m0y n@ame i3s man!is#hh";
    //Res="my name is manish"
    public static void main(String[] args) {
        String s = "m0y n@ame i3s man!is#h";
        String res = "";
        for (int i = 0; i < s.length(); i++) {


            //System.out.println("value is"+val);
            if (Character.isLetter(s.charAt(i)) || s.charAt(i) == ' ') {
                res += s.charAt(i);


            }


        }
        System.out.println(res.trim());
//        System.out.println(1+'m'+'g');//213
//        System.out.println("1"+'m'+'g');//1mg
//        System.out.println("1"+"m"+'g');//1mg
        System.out.println("------------");
        System.out.println(100+'s');
        System.out.println(100+"s");
        System.out.println('i'+1+'a');
        System.out.println('i'+'1'+"a");
        System.out.println('i'+"1"+'a');

        //2nd approach
        String res2 = "";

        for (int i = 0; i < s.length(); i++) {


            int val = s.charAt(i);
            if ((val >= 65 && val <= 90) || (val >= 97 && val <= 122) || s.charAt(i) == ' ') {
                res2 += s.charAt(i);

            }

        }
        System.out.println(res2);

    }
}
