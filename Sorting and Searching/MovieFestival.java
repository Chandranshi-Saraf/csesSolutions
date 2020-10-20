import java.io.*;
import java.util.*;
public class MovieFestival{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long arrival[]=new long[n];
    long dept[]=new long[n];
    for(int i=0;i<n;i++){
        dept[i]=sc.nextLong();
        arrival[i]=sc.nextLong();
    }
    sort(arrival,dept,0,n-1);
    long curr=-1;
    long ans=0;
    for(int i=0;i<n;i++)
    {
        if(dept[i]>=curr)
        {
            ans++;
            curr=arrival[i];
        }

    }
    System.out.println(ans);
}
public static int partition(long arr[], long dept[],int low, int high) 
    { 
        long pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
                long temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
                long temp2=dept[i];
                dept[i]=dept[j];
                dept[j]=temp2;
            } 
        } 
        long temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        long temp2=dept[i+1];
        dept[i+1]=dept[high];
        dept[high]=temp2;
  
        return i+1; 
    } 
public static void sort(long arr[],long dept[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, dept, low, high); 
            sort(arr,dept,low,pi-1); 
            sort(arr,dept,pi+1,high); 
        } 
    } 

    }