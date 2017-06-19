import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int arr[]=new int[n];
        int newArr[]=new int[n];
        int left;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            left =j;
            for(int k=0;k<d;k++)
            {
                if(left==0)
                    left=n-1;
                else
                    left--;
            }
            newArr[left]= arr[j];
        }
        for(int l=0;l<n;l++)
        System.out.print(newArr[l]+" ");
    }
}
