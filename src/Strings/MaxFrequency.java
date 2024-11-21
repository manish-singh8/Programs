package Strings;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {

    public static void main(String[] args) {
        String s="iasi21aaai5";
        HashMap<Character,Integer> mapping=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(mapping.containsKey(s.charAt(i)))
            {
                mapping.put(s.charAt(i),mapping.get(s.charAt(i))+1);
            }
            else
                mapping.put(s.charAt(i),1);

        }
        int max=0;
        char value1 =' ';
       System.out.println(mapping.entrySet());
        for(Map.Entry<Character,Integer> m: mapping.entrySet())
        {
            if(m.getValue()>max)
            {
                max=m.getValue();
                value1=m.getKey();
                
            }

        }
        System.out.println(value1);
        
    }
}
