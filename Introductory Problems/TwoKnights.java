import java.io.*;
import java.util.*;
public class TwoKnights{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long ip=Long.parseLong(br.readLine());
    long n=1;
    while(n<=ip)
    {
        long allPermutations=(n*n*((n*n)-1))/2;
        long threats=4*(n-1)*(n-2);
        System.out.println(allPermutations-threats);
        n++;
    }

    
}
}
