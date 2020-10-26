import java.io.*;
import java.util.*;
public class subarrayFirst{
    public static void main(String args[])throws IOException
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long x=sc.nextLong();
    long arr[]=new long[n];
    long sum=0;
    boolean flag=false;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextLong();
    }
    int start=0;
    int end=0;
    int count=0;
    sum=arr[start];
    while(end<n && start<=end)
    {
        while(sum>=x && start<end){
            if(sum==x)
            {
                count++;
            }
            sum=sum-arr[start++];
        }
        while(sum<x && end<n-1)
        {
            
            sum=sum+arr[++end];
        }      
    }
    if(start==end && arr[start]==x)
        count++;
    System.out.println(count);


}
}
