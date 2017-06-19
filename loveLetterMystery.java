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
            int i=0,count=0;
            int j= s.length()-1;
            while(i<=j)
            {
            	count+=Math.abs(s.charAt(i) - s.charAt(j));
            	i++; j--;
            }
            System.out.println(count);
        }
    }
}