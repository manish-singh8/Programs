package Arrays;

import java.util.Arrays;

public class SecondSmallest {

    public static void main(String[] args) {
        int input[]={1,2,5,6,3,2};
        int min=input[0],second= Integer.MAX_VALUE;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]<min) {
                min=input[i];
            }
        }
        //Arrays.sort(input);System.out.println(input[1]);
        for(int i=0;i<input.length;i++)
        {
            if(input[i]!=min && input[i]<second) {
                second=input[i];
            }
        }
        System.out.println(second);
    }
}
