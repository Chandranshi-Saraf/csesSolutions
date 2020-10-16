import java.io.*;
import java.util.*;
public class TrailingZeros{
    public static void main(String args[])throws IOException
    {
    
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    long powerOfFive=5;
    long count=0;
    
    while(powerOfFive<=n)
    {
        count=count+(n/powerOfFive);
        powerOfFive=powerOfFive*5;

    }
    
    System.out.println(count);
}
}
