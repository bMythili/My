import java.io.*;
import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c[]={'a','e','i','o','u'};
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c[i])
            System.out.print("vowel");
            else
            System.out.print("consonant");
        }
    }
}
