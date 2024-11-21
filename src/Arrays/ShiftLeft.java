package Arrays;

public class ShiftLeft {
//    arr[] ={1,2,3,4,5};
//if n=1 then output = {2,3,4,5,1}
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int n=8;
        int size= arr.length;
        int newarr[]=new int[size];

        if(n>size)
        {
            n=n%size;
        }
        for(int i=0;i<size;i++)
        {
            int current=i-n;
            if(current<0) {
                current = size + current;
            }
                newarr[current]=arr[i];

        }

        for (int i=0;i<size;i++)
        {
            System.out.println(newarr[i]);

        }


    }
}
