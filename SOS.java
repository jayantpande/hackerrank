import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length(),n_msg= n/3,count=0;
        String str="";
        for(int i=1;i<=n_msg;i++)
        {
        	str= str+"SOS";
        }
        for(int j=0;j<n;j++)
        {
        	if(s.charAt(j)!=str.charAt(j))
        	{
        		count++;
        	}
        }
        System.out.println(count);
    }
}