import java.io.*;
import java.util.*;
public class TwoSets{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long ip=Long.parseLong(br.readLine());
    int size1=(int)(ip/2);
    int size2=(int)(ip-size1);
    long sum1=0;
    long sum2=0;
    long arr1[]=new long[size1];
    long arr2[]=new long[size2];
    long flag=1;
    long pos=2;
    int n=1;
    if(ip==1)
        System.out.println("NO");
    else
    {
    while(ip>0)
    {
        arr1[n-1]=ip;
        sum1=sum1+ip--;
        if(ip<=0)
            break;
        arr2[n-1]=ip;
        sum2=sum2+ip--;
        if(ip<=0)
            break;
        n++;
        arr2[n-1]=ip;
        sum2=sum2+ip--;
        if(ip<=0)
            break;
        arr1[n-1]=ip;
        sum1=sum1+ip--;

        n++;
        if(n>size1)
            break;

    }
    if(sum1==sum2 && ip==0)
    {
        System.out.println("YES");
        System.out.println(arr1.length);
        for(int i=0; i<arr1.length; i++)
            System.out.print(arr1[i]+" ");
        System.out.println();
        System.out.println(arr2.length);
        for(int i=0; i<arr2.length; i++)
            System.out.print(arr2[i]+" ");

    }
    else
        System.out.println("NO");
   
   }

    
}
}
