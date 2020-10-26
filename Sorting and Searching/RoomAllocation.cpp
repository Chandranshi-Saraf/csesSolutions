#include<bits/stdc++.h>
#define lli long long int
using namespace std;

int main()
{
  int n,x,y;
  vector<pair<int,int>> arr;
  vector<pair<int,int>> rooms;
  vector<int>ans;
  vector<int>::iterator it;
  cin>>n;
  for(int i=0;i<n;i++)
    {
        cin>>x>>y;
        arr.push_back(make_pair(x,y));
    }
  int k=0;
  rooms.push_back(make_pair(arr[0].second,++k));
  ans.push_back(k);
  for(int i=1;i<n;i++)
  {
        int pos=lower_bound(rooms.begin(),rooms.end(),arr[i].first)-rooms.begin();
        if(arr[i].first==rooms[pos].second)
            pos--;
        if(pos<0)
        {
            rooms.push_back(make_pair(arr[i].second,++k));
            ans.push_back(k);
        }
        else
        {
            rooms[pos].first=arr[i].second;
            ans.push_back(rooms[pos].second);
            sort(rooms.begin(),rooms.end());
        }
  }
    cout<<k<<endl;
    for(int i=0;i<n;i++)
    {
      cout<<ans[i]<<" ";
    }
  return 0;
}