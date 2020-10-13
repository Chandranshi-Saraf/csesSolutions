import java.io.*;
import java.util.*;
public class IncreasingArray{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    //System.out.println(n);
    String allnums=br.readLine();
    String[] nums=allnums.split(" ");
    long maxCount=Long.parseLong(nums[0]);
    int count=1;
    long sum=0;
    while(count<n)
    {
    	long ip=Long.parseLong(nums[count++]);
        if(ip<maxCount)
        {
            sum=sum+(maxCount-ip);
        }
        if(ip>maxCount)
            maxCount=ip;
    }
    System.out.println(sum);
}
}
