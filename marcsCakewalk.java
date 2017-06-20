import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }

	    int temp;
	    int start=0;
	    int end= n-1;
	    Arrays.sort(calories);
    	while (start < end)
    	{
        	temp = calories[start];   
        	calories[start] = calories[end];
        	calories[end] = temp;
        	start++;
        	end--;
    	}     

       	double count=0, prev=0;
        for(int i=0;i<n;i++)
        {
        	count = (int) count + (calories[i]*Math.pow(2,i));
        	
        }
        System.out.println((int)count);
    }
}
