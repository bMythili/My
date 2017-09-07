import java.io.*;
import java.util.*;
public class Alpha
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetter(ch[i]))
            System.out.print("alphabet");
            else
            System.out.print("not alphabet");
        }
    }
}
