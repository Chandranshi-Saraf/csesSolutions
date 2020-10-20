import java.io.*;
import java.util.*;
public class MAxSubArray{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long nArray[]=new long[n];
    for(int i=0;i<n;i++) 
        nArray[i]=sc.nextLong();

    long sum=0;
    long max=Integer.MIN_VALUE;
   
    for(int i=0; i<n; i++){
        sum=sum+nArray[i];
        if(max<sum)
            max=sum;
        if(sum<0)
            sum=0;
    }
    System.out.println(max);
}
}
