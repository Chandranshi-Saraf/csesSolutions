import java.io.*;
import java.util.*;
public class BitStrings{
    public static void main(String args[])throws IOException
    {
    int mod = 1000000007;
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    long ans=1;
    long x=2;
    while (n>0)  
    { 
        if ((n & 1)==1) 
            ans=(ans*x)%mod; 
        n=n >> 1;
        x=(x*x)%mod; 
    } 
    System.out.println(ans);
}
}
