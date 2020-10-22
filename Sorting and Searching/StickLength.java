import java.io.*;
import java.util.*;
public class StickLength{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long nArray[]=new long[n];
    for(int i=0;i<n;i++) 
        nArray[i]=sc.nextLong();
    Arrays.sort(nArray);
    long key=nArray[n/2];
    long sum=0;
    // if(n%2==0)
    //     key=(nArray[n/2]+nArray[n/2 +1])/2;
    // else
    //     key=nArray[n/2];
    //System.out.println(key);
    for(int i=0; i<n; i++){
        sum=sum+Math.abs(nArray[i]-key);
    }
    System.out.println(sum);
}
}
