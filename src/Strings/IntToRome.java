package Strings;

import java.util.HashMap;

public class IntToRome {
//    public static String output = "";

    public static void main(String[] args) {
        int num = 1994;
        String output="";


        HashMap<Integer, String> romanMappings = new HashMap<>();
        romanMappings.put(0,"");
        romanMappings.put(1,"I");
        romanMappings.put(2,"II");
        romanMappings.put(3,"III");
        romanMappings.put(4,"IV");
        romanMappings.put(5,"V");
        romanMappings.put(6,"VI");
        romanMappings.put(7,"VII");
        romanMappings.put(8,"VIII");
        romanMappings.put(9,"IX");
        romanMappings.put(10,"X");
        romanMappings.put(20,"XX");
        romanMappings.put(30,"XXX");
        romanMappings.put(40,"XL");
        romanMappings.put(50,"L");
        romanMappings.put(60,"LX");
        romanMappings.put(70,"LXX");
        romanMappings.put(80,"LXXX");
        romanMappings.put(90,"XC");
        romanMappings.put(100,"C");
        romanMappings.put(200,"CC");
        romanMappings.put(300,"CCC");
        romanMappings.put(400,"CD");
        romanMappings.put(500,"D");
        romanMappings.put(600,"DC");
        romanMappings.put(700,"DCC");
        romanMappings.put(800,"DCCC");
        romanMappings.put(900,"CM");
        romanMappings.put(1000,"M");
        romanMappings.put(2000,"MM");
        romanMappings.put(3000,"MMM");


        String n1 = String.valueOf(num);

        for (int i = 0; i < n1.length(); i++) {
            int j = i+1;
            int firstNum = Integer.parseInt(String.valueOf(n1.charAt(i)));
            int multiplier = 1;
            while (j < n1.length()) {
                multiplier *= 10;
                j++;
            }
            firstNum = firstNum * multiplier;
            output += romanMappings.get(Integer.valueOf(firstNum));
        }
        System.out.println("Int to Rome of "+n1+" is: "+output);
//        int measure=n1.length();
//        if(measure>4)
//            measure=4;
//
//        switch (measure)
//        {
//            case 1:
//
//                break;
//
//            case 2:
//                int add=ReturnRomanNumeral(n,50,2);
//                break;
//
//            case 3:
//                break;
//
//            case 4:
//                break;
//
//        }
//
//
//
//
//
//
//
//    }
//    public static int ReturnRomanNumeral(int n1,int num1,int measure1)
//    {
//        int quo=n1/num1;
//        int rem=n1%num1;
//
//
//
//
//        return 0;
//    }
    }
}
