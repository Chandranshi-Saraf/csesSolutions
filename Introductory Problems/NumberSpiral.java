import java.io.*;
import java.util.*;
public class NumberSpiral{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    long t=Long.parseLong(br.readLine());
    while(t>0)
    {
        String ip=br.readLine();
        String iparr[]=ip.split(" ");
        long x= Long.parseLong(iparr[0])-1;
        long y= Long.parseLong(iparr[1])-1;
        if(x<=y)
        {
            if(y%2==0)
                System.out.println(((y+1)*(y+1))-x);
            else
                System.out.println((y*y)+1+x);

        }
        else
        {
            if(x%2==0)
                System.out.println((x*x)+1+y);
            else
                System.out.println(((x+1)*(x+1))-y);

        }
        t--;
    }
    
}
}
