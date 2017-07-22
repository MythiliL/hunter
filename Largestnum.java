import java.io.*;
import java.util.*;
class Largestnum
{
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        d=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.print("largest num:"+d);
    }
}
