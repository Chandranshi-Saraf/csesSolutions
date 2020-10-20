import java.io.*;
import java.util.*;
public class ResturantCustomer{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long arrival[]=new long[n];
    long dept[]=new long[n];
    for(int i=0;i<n;i++){
        arrival[i]=sc.nextLong();
        dept[i]=sc.nextLong();
    }
    Arrays.sort(arrival);
    Arrays.sort(dept);
    long count=1;
    long max=Integer.MIN_VALUE;
    int j=0;
    int i=1;
    while(i<n && j<n)
    {
        if(arrival[i]<=dept[j]){
            count++;
            i++;
        }
        else if (arrival[i] > dept[j]) { 
            count--; 
            j++; 
        }
            
        if(count>max)
            max=count;

    }
    System.out.println(max);
}
}
