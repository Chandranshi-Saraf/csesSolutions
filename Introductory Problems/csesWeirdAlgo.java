import java.io.*;
import java.util.*;
public class csesWeirdAlgo{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    while(n!=1)
    {
    	System.out.print(n+" ");
    	if(n%2==0)
    		n=n/2;
    	else
    		n=(n*3)+1;
    }
    System.out.print(n);
}
}
