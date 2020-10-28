import java.io.*;
import java.util.*;
public class SubArrayDivisiblity{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //int k=sc.nextInt();
    long nArray[]=new long[n];
    for(int i=0;i<n;i++) 
        nArray[i]=sc.nextLong();

    long[] rem=new long[n];
    rem[0]++;
    int sum=0;
    long counter=0;
   
    for(int i=0; i<n; i++){
        sum=(int)((sum+nArray[i])%n +n)%n;
        counter+=rem[sum];
        rem[sum]++;
    }
    System.out.println(counter);
}
}
