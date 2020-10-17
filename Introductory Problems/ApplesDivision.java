import java.io.*;
import java.util.*;
public class ApplesDivision{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    String allnums=br.readLine();
    String[] nums=allnums.split(" ");
    long input[]=new long[nums.length];
    long totalSum=0;
    for(int i=0;i<nums.length;i++){
        input[i]=Long.parseLong(nums[i]);
        totalSum=totalSum+input[i];
    }
    if(n==1)
        System.out.println(input[0]);
    else{
    long combinations=(long)Math.pow(2,input.length)-1;  
    long sum=0;
    long minDiff=Integer.MAX_VALUE;
    for(int i=1;i<combinations;i++)
    {
        sum=0;
        int k=i;
        for(int j=0;j<input.length && k>0;j++)
        {
            
            if((k&1) ==1)
            {
                sum=sum+input[j];
            }
            k=k >> 1;
        }
        long diff=totalSum-sum;
        diff=Math.abs(diff-sum);
        if(diff < minDiff)
            minDiff=diff;
        
        
    }
    System.out.println(minDiff);
}

}
}
