package Strings;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
///*
//* Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]*/
public class TwoSums {
////https://leetcode.com/problems/two-sum/description/
public static void main(String[] args) {
        /*nums = [2,7,11,15], target = 9
        Output: [0,1]*/

    int arr[]={2,7,11,15};
    int res[]=new int[2];
    int target = 9;

    for(int i=0;i<arr.length-1;i++){
        int sum=0;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                res[0]=i;
                res[1]=j;
                break;
            }
        }
    }
    for(int x: res){
        System.out.print(x);
    }


}
}