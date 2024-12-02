import java.io.*; 
import java.util.*; 
class main{ 
public static void main(String v[]){ 
int j = 1; 
int nums[]={0,0,1,1,2,2,3,3,4}; 
for (int i = 1; i < nums.length; i++) { 
if (nums[i] != nums[i - 1]) { 
nums[j] = nums[i]; 
j++; 
} 
} 
System.out.print(j); 
} 
}