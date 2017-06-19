import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        String[] strings = new String[n];
        for(int i=0;i<n;i++)
        {
            strings[i]= in.next();
        }
        int q= in.nextInt();
        String[] queries= new String[q];
        for(int j=0;j<q;j++)
        {
            int count=0;
            queries[j] = in.next();
            for(int k=0;k<n;k++)
            {
                if(queries[j].toLowerCase().contains(strings[k].toLowerCase()))
                    count++;
            }
            System.out.println(count);
        }

    }
} 