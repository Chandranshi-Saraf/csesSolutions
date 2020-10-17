import java.io.*;
import java.util.*;
public class DistinctNumbersWithoutHashMap{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    String allnums=br.readLine();
    String[] nums=allnums.split(" ");
    long num[]=new long[nums.length];
    long count=0;
    for(int i=0;i<nums.length;i++)
        num[i]=Long.parseLong(nums[i]);

    Arrays.sort(num);
    if(nums.length>0)
        count=1;
    for(int i=1;i<nums.length;i++)
    {
        if(num[i]!=num[i-1])
            count++;
    }
    
    System.out.println(count);

}
}
