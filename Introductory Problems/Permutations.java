import java.io.*;
import java.util.*;
public class Permutations{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long n=Long.parseLong(br.readLine());
    if(n==1)
        System.out.println(n);
    else if(n<4)
        System.out.println("NO SOLUTION");
    
    else
    {
        long count=2;
        while(count<=n){
            System.out.print(count+" ");
            count=count+2;
        }
        count=1;
        while(count<=n){
            System.out.print(count+" ");
            count=count+2;
        }

    }
    
}
}
