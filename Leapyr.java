import java.io.*;
import java.util.*;
class Leapyr
{
    public static void main(String args[])
    {
        int a;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        if(a%4==0)
       
        System.out.print("leap year:"+a);
        else
        System.out.print("not a leap year");
     }
}
