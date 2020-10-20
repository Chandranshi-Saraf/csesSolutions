import java.io.*;
import java.util.*;
public class FerrisWheel{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long x=sc.nextLong();
    List<Long> nList= new ArrayList<Long>();
    long nArray[]=new long[n];
    for(int i=0;i<n;i++) 
        nArray[i]=sc.nextLong();
        
    Arrays.sort(nArray);
    long count=0;
    int i=0;
    int j=n-1;
    while(i<=j)
    {
        if(nArray[i]+nArray[j]>x)
            j--;
        else
        {
            i++;
            j--;
        }
        count++;
    }
    System.out.println(count);


}
}
