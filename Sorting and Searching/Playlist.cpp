#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,x;
    cin>>n;
    vector<int> nArray(n);
    for(int i=0;i<n;i++){
        cin>>nArray[i];
    }
    int start=0;
    int length=1;
    int max=INT_MIN;
    std::map<int, int> pos;
    pos[nArray[0]]=0;
    for(int i=1; i<n; i++){
        //cout<<length<<'\n';
        //System.out.println(length);
        if(pos.find(nArray[i]) != pos.end()){
            start=std::max(start,pos[nArray[i]]+1);
            length=(i-start)+1;
            pos[nArray[i]]=i;
        } 
        else
        {
            pos[nArray[i]]=i;
            length++;
        }
        max=std::max(max,length);

 
    }
    cout<<max;
    return 0;
}