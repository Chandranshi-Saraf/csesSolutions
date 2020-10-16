import java.io.*;
import java.util.*;
public class ApplesDivision{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    //System.out.println(n);
    String allnums=br.readLine();
    String[] nums=allnums.split(" ");
    long input[]=new long[nums.length];
    for(int i=0;i<nums.length;i++)
        input[i]=Long.parseLong(nums[i]);

     Arrays.sort(input); 
     long sum1=0;
     long sum2=0;

     for(int i=input.length-1;i>=0;i--)
     {
        if(sum1<sum2)
            sum1=sum1+input[i];
        else
            sum2=sum2+input[i];
     }

    
    System.out.println(Math.abs(sum1-sum2));
}
}
