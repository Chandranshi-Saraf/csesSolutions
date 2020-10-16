import java.io.*;
import java.util.*;
public class CoinPiles{
    public static void main(String args[])throws IOException
    {
    //int mod = 1000000007;
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);
    long t=Long.parseLong(br.readLine());
    while(t>0)
    {
        t--;
        String ans="NO";
        String ip=br.readLine();
        String iparr[]=ip.split(" ");
        long x= Long.parseLong(iparr[0]);
        long y= Long.parseLong(iparr[1]);
        if(y<x)
        {
            long temp=y;
            y=x;
            x=temp;
        }
        if((2*x) > y){

            x=x%3;
            y=y%3;
            if((x==0 && y==0) || x>0 && y>0 && x!=y)
                ans="YES";
        }
        else if((2*x) == y)
            ans="YES";
        else
        {
            
        }

        System.out.println(ans);

    }
    
    
}
}
