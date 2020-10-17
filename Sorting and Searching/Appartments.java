import java.io.*;
import java.util.*;
public class Appartments{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(r);
    String input=br.readLine();
    String inputs[]=input.split(" ");
    long n=Long.parseLong(inputs[0]);
    long m=Long.parseLong(inputs[1]);
    long k=Long.parseLong(inputs[2]);
    String nString=br.readLine();
    String mString=br.readLine();
    List<String> nListString = Arrays.asList(nString.split(" "));
    List<String> mListString = Arrays.asList(mString.split(" "));
    List<Long> nList=new ArrayList<Long>();
    List<Long> mList=new ArrayList<Long>();
    for(String s : nListString) 
        nList.add(Long.valueOf(s));
    for(String s : mListString) 
        mList.add(Long.valueOf(s));
        
    Collections.sort(nList);
    Collections.sort(mList);
    long count=0;
    int i=0;
    int j=0;

    while(i<n && j<m)
    {
        if(Math.abs(nList.get(i)-mList.get(j))<=k)
        {
            count++;
            i++;
            j++;
        }
        else if(nList.get(i)<mList.get(j))
            i++;
        else
            j++;
    }
    
    System.out.println(count);

}
}