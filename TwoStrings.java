import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2){
        for(int i=97; i <=122;i++)
        {
        		if((s1.indexOf(i) >=0)&& (s2.indexOf(i) >=0))
        	{
        		return "YES";
        	}
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
