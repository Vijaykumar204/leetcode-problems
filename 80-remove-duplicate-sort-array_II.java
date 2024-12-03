import java.util.ArrayList;
import java.util.*;
class Main {
    public static void bb(int[] nums,int val) {
        int c=0,k=0;
       
         nums[k++]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1] && c==0){
                nums[k++]=nums[i];
                c=1;
            }
            else{
               if(nums[i]!=nums[i-1]){
                nums[k++]=nums[i];
                c=0;
               }
            }
        }
        System.out.println(k);
        //  for(int i=0;i<nums.length;i++){
        //      System.out.println(nums[i]);
        //  }
    }
    public static void main(String v[]){
        int nums[]={0,0,1,1,1,1,2,3,3};
        int val=3;
        bb(nums,val);
    }
}