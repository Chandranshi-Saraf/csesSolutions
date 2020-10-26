import java.io.*;
import java.util.*;
public class ReadingBooks{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long sum=0;
    long max=0;
    long x=0;
    for(int i=0;i<n;i++){
        x=sc.nextLong();
        sum=sum+x;
        max=Math.max(max,x);
    }
    max=max*2;

    System.out.println(Math.max(max,sum));
}
}
