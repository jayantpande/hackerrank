import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s= s.toLowerCase();
    	String r =s;
    	int freqarray[] = new int[26];


   		for(int i=0; i <s.length(); i++)
   		{
   			freqarray[s.charAt(i)-'a']++;
   		}
        int flag=0,prev=0;
        for(int i=0;i<26;i++)
        {
        	
        	if(freqarray[i]==prev||prev==0)
        		{
        		prev= freqarray[i];
        		}
    		else if((freqarray[i]!=0) && freqarray[i]!=prev-1 && flag<2||freqarray[i]==1)
    			{
    				flag++;
    			}
    		
    }
    if(flag<2)
    	System.out.println("YES");
    else
    	System.out.println("NO");
    }
}
