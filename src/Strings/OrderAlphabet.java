package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OrderAlphabet {

    public static void main(String[] args) {
        String input="aaeddaaeddddaa";

        String output="";
        HashMap<Character,Integer> alphabetMappings=new HashMap<>();

        for(char c: input.toCharArray())
        {
            if(alphabetMappings.containsKey(c))
                alphabetMappings.put(c,alphabetMappings.get(c)+1);
            else
                alphabetMappings.put(c,1);

        }
        for(Map.Entry<Character,Integer> m: alphabetMappings.entrySet())
        {
            String k=String.valueOf(m.getKey());
            int i=m.getValue();
            String v=String.valueOf(i);
            output+=k+v;
        }
        System.out.println(output);
    }
}
