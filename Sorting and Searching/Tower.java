import java.io.*;
import java.util.*;
public class Tower{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Long> nArray=new ArrayList<>();
    //long nArray[]=new long[n];
    // for(int i=0;i<n;i++) 
    //     nArray[i]=sc.nextLong();
    nArray.add(sc.nextLong());
    int count=1;
    int k=1;
    for(int i=1; i<n; i++){
        long curr=sc.nextLong();
        //System.out.println(nArray);
        if(nArray.get(nArray.size()-1)<=curr)
        {
            nArray.add(curr);
            count++;          
        }
        else
        {
            int pos=Collections.binarySearch(nArray,curr);
            //System.out.println(curr+" "+pos);
            if(pos<0){
                pos=(-1*(pos))-1;
                if(pos<nArray.size()){
                    nArray.set(pos,curr);
                    continue;
                }
                nArray.add(pos,curr);
                count++;
                continue;
            }
            else{
                pos=pos+1;
                while(nArray.get(pos)==curr)
                    pos++;
                if(pos<nArray.size()){
                    nArray.set(pos,curr);
                    continue;
                }
                else{
                    nArray.add(curr);
                    count++;
                }
            }
    }
    }
    System.out.println(count);
}
}