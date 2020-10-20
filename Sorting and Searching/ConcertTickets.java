import java.io.*;
import java.util.*;
public class ConcertTickets{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    List<Long> nList= new ArrayList<Long>();
    for(int i=0;i<n;i++) 
        nList.add(sc.nextLong());
    Collections.sort(nList);
    for(int i=0;i<m;i++)
    {
        long curr=sc.nextLong();
        int pos=Collections.binarySearch(nList, curr);
        if(pos>=0 && pos<nList.size() && nList.get(pos) == curr)
        {
            System.out.println(nList.get(pos));
            nList.remove(pos);
        }
        else
            {   if(pos == -1)
                    System.out.println(-1);
                else
                {
                pos=(-1*(pos+1))-1;
                if(pos>=0)
                {
                    System.out.println(nList.get(pos));
                    nList.remove(pos);
                }
                }
            }

    }
}}