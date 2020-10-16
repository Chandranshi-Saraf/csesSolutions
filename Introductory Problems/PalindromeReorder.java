import java.io.*;
import java.util.*;
public class PalindromeReorder{
    public static void main(String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);
    String str=br.readLine();
    HashMap<Character,Integer> freq=new HashMap<>();
    int oddCount=0;
    String ans="NO SOLUTION";
    for(int i=0;i<str.length();i++)
    {
        if(freq.containsKey(str.charAt(i)))
        {
            int c=freq.get(str.charAt(i));
            if(c%2==0)
                oddCount++;
            else
                oddCount--;
            freq.replace(str.charAt(i),++c);
        }
        else
        {
            freq.put(str.charAt(i),1);
            oddCount++;
        }
    }
    if(oddCount>1)
        System.out.print(ans);
    else if(str.length()==1)
        System.out.println(str);
    else
    {
        StringBuilder ans2 = new StringBuilder();
        char odd=' ';
        for(char key : freq.keySet())
        {
            if(freq.get(key)==1)
                odd=key;
            else
            {
                int c=freq.get(key)/2;
                String temp=new String(new char[c]).replace('\0', key);
                ans2.insert(0,temp);
                ans2.append(temp);
                c=freq.get(key)%2;
                    
                if(c==1)
                    odd=key;
            }
        }
        if(oddCount==1)
        {
            int pos=ans2.length()/2;
            ans2.insert(pos,odd);
            
        }

        System.out.print(ans2);
    }
    
}
}
