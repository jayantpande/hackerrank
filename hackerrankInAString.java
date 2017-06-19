import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String hack= "hackerrank";
            int j=0;
            String str="";
     		for(int i=0;i<s.length();i++)
     		{
                if(j<10)
                {
     			if(s.charAt(i)==hack.charAt(j))
     			{
     				str=str+s.charAt(i);
                    j++;
     			}
               }
     		}
          
     		if((str).equals(hack))
     			System.out.println("YES");
     		else
     			System.out.println("NO");
        }
    }
}