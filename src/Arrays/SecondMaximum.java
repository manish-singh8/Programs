package Arrays;

public class SecondMaximum {

    public static void main(String[] args) {
        int input[]={1,2,5,6,3,2};
        int max=0,second=0;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>max)
            {
                second=max;
                max=input[i];

            }
            else if(input[i]>second)
            {
                second=input[i];
            }
        }
        System.out.println(second);
    }
}
