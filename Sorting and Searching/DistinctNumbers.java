import java.io.*;
import java.util.*;
public class DistinctNumbers{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    String allnums=br.readLine();
    String[] nums=allnums.split(" ");
    HashMap<Long,Integer> freq=new HashMap<>();
    long count=0;
    for(int i=0;i<nums.length;i++){
        long num=Long.parseLong(nums[i]);
        if(freq.containsKey(num))
            continue;
        else
        {
            freq.put(num,1);
            count++;
        }
    }
    
    System.out.println(count);

}
}
