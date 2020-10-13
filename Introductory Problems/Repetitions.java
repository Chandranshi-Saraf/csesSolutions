import java.io.*;
import java.util.*;
public class Repetitions{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    String ip=br.readLine();
    int maxCount=0;
    int count=1;
    char check=ip.charAt(0);
    for(int i=1;i<ip.length();i++)
    {
        if(ip.charAt(i)==check)
            count++;
        else
        {
            if(maxCount<count)
                maxCount=count;
            count=1;
            check=ip.charAt(i);
        }
    }
    if(maxCount<count)
                maxCount=count;
    System.out.println(maxCount);
    
}
}
