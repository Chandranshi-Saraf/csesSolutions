import java.io.*;
import java.util.*;
public class MissingNumber{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    //System.out.println(n);
    long sum=(long)n*(n+1)/2;
    long sum2=0;
    int count=0;
    String allnums=br.readLine();
    String[] nums=allnums.split(" ");
    while(count<n-1)
    {
    	long ip=Long.parseLong(nums[count++]);
        sum2=sum2+ip;
    }
    System.out.println(sum-sum2);
}
}
