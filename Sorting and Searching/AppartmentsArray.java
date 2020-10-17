import java.io.*;
import java.util.*;
public class AppartmentsArray{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    //BufferedReader br=new BufferedReader(r);
    int n=sc.nextInt();
    int m=sc.nextInt();
    long k=sc.nextLong();
    long nList[]=new long[n];
    long mList[]=new long[m];
    for(int i=0;i<n;i++) 
        nList[i]=sc.nextLong();
    for(int i=0;i<m;i++) 
        mList[i]=sc.nextLong();
        
    Arrays.sort(nList);
    Arrays.sort(mList);
    long count=0;
    int i=0;
    int j=0;

    while(i<n && j<m)
    {
        if(Math.abs(nList[i]-mList[j]) <=k)
        {
            count++;
            i++;
            j++;
        }
        else if(nList[i]<mList[j])
            i++;
        else
            j++;
    }

    System.out.println(count);

}
}
