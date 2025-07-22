// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class reverse {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
    int num[]={1,2,3,4,5};
    reverse(num,0,4);
    
   
         System.out.print(Arrays.toString(num));

        
    }
    public static void reverse (int[] nums,int start,int end){
        while(start<end){
            int temp =nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    }
