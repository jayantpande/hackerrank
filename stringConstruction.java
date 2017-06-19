import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int stringConstruction(String s){
    	String res="";
    	int count=0;
    	if(s=="")
    	{
    		return 0;
    	}
        for(int i=0;i<s.length();i++)
        {

        	if(res.indexOf(s.charAt(i))<0)
        	{
        		count++;
        	}
        	res=res+s.charAt(i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
    }
}
