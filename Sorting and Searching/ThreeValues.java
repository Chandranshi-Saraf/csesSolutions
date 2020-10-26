import java.io.*;
import java.util.*;
public class ThreeValues{
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
    Arrays.sort(arr);
    for(int i=0;i<n-2;i++)
    {
        sum=x-arr[i];
        int l=i+1;
        int r=n-1;
        while(l<r)
        {
            if(arr[l]+arr[r]==sum)
            {
                System.out.println((i+1) +" "+(l+1)+" "+(r+1));
                flag=true;
            }
            else if(arr[l]+arr[r]<sum)
                l++;
            else
                r--;
        }
    }
    if(!flag)
        System.out.println("IMPOSSIBLE");


}
}
