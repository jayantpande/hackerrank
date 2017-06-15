import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        int total=0,answer=0;
        for(int i=0;i<n;i++) 
        	prices[i]=stdin.nextInt();
        
        Arrays.sort(prices);

        for(int i=0;((total+prices[i])<=k&& i<n);i++) 
    	{	
    				total+=prices[i];
    				answer++;
    	}							       
        
        System.out.println(answer);
    }
}