package Strings;

public class LastWord {

    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        s=s.trim();
        String ch[]=s.split(" ");

        System.out.println(ch[ch.length-1].length());
    }
}
