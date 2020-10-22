import java.io.*;
import java.util.*;
public class Playlist{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long nArray[]=new long[n];
    for(int i=0;i<n;i++) 
        nArray[i]=sc.nextLong();
    int start=0;
    int length=1;
    int max=Integer.MIN_VALUE;
    HashMap<Long,Integer> pos=new HashMap<>();
    pos.put(nArray[0],0);
    for(int i=1; i<n; i++){
        //System.out.println(length);
        if(pos.containsKey(nArray[i])){
            start=Math.max(start,pos.get(nArray[i])+1);
            length=(i-start)+1;
            pos.replace(nArray[i],i);
        } 
        else
        {
            pos.put(nArray[i],i);
            length++;
        }
 
        if(max<length)
            max=length;
 
    }
    System.out.println(max);
}
}