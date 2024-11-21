package Arrays;

import Strings.StringOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class Poc {


    public static void main(String[] args) {
        String s="My name is Khan";
        String output="";
        String output2="";
        char ch1[]=s.toCharArray();
        for(char c:ch1)
        {
            if(Character.isUpperCase(c))
            {
                output+=Character.toLowerCase(c);
            }
            else
                output+=Character.toUpperCase(c);


        }
        System.out.println("The new String is\n"+output);
         String srr[]=s.split(" ");
         for(String f1:srr)
         {
             String f2="";
             char ch[]=f1.toCharArray();
             f2+=Character.toUpperCase(ch[0]);
             for(int i=1;i<ch.length;i++)
             {
                 f2+=ch[i];

             }
             f2+=" ";
             output2+=f2;
         }
         output2=output2.trim();
         System.out.println("The capitalise each word of string is\n"+output2);
        System.out.println("The equalsIgnorecase: "+output.equalsIgnoreCase(output2));
        System.out.println("The equals: "+output.equals(output2));
        System.out.println("The ==: "+output==output2);

        Integer arr[]={8,0};
        List<Integer> l1= new ArrayList<Integer>(Arrays.asList((arr)));
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        Arrays.sort(arr);
        System.out.println();

        int a=6452;
        String s2=String.valueOf(a);
        System.out.println(s2);
        int b=Integer.parseInt(s2);
        System.out.println(b);

        String f="ss1hj22bh1";
        char fh[]=f.toCharArray();
        int sum=0;
        for (int i=0;i<fh.length;i++)
        {
            if(Character.isDigit(fh[i]))
            {

                int num=fh[i]-'0';
                sum+=num;

            }
        }
        System.out.println(sum);

    }
}
