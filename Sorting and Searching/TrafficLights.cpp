#include<bits/stdc++.h>
#define lli long long int
using namespace std;

int main()
{
  int n,x,y;
  vector<int> arr;
  set<int> arrSort;
  vector<int> res;
  vector<int>::iterator it;
  set<int>::iterator itr;
  cin>>n>>x;
  for(int i=0;i<x;i++)
    {
        cin>>y;
        arr.push_back(y);
        arrSort.insert(y);
    }
  arrSort.insert(0);
  arrSort.insert(n);
  lli length=0;
  lli max=0;
  int prev=0;
  for (itr = arrSort.begin();itr!=arrSort.end(); itr++) 
    {  
        length=*itr-prev;
        max=std::max(length,max);
        prev=*itr;
    }
    itr=arrSort.begin();
    max=std::max(length,max);
    res.push_back(max);
    for(int i=x-1;i>=0;i--)
    {
      int curr=arr[i];
      set<int>::iterator pos=arrSort.lower_bound(curr);
      length= *(++pos)-*(--(--pos));
      max=std::max(length,max);
      res.push_back(max);
      arrSort.erase(++pos);
    }

    for(int i=x-1;i>=0;i--)
    {
      cout<<res[i]<<" ";
    }
  return 0;
}