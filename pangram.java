import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
    	 ArrayList<String>alphabet = new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
         alphabet.remove(0);
         Scanner stdin=new Scanner(System.in);
         String s = stdin.nextLine().toLowerCase();
         for(int i=0;i<s.length();i++)
         {
         	if(!alphabet.isEmpty()){
                alphabet.remove(""+s.charAt(i));
            }else{
                break;
            }
         }
         if(alphabet.isEmpty())
         	System.out.println("pangram");
         else
         	System.out.println("not pangram");
    }
}