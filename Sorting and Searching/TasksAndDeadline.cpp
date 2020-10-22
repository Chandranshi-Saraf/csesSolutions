#include<bits/stdc++.h>
#define lli long long int
using namespace std;

int main()
{
  int n,x,y;
  vector<pair<int,int>> arr;
  cin>>n;
  while (n--)
  {
    cin >>x>> y;
    arr.push_back(make_pair(x,y));
  }
  sort(arr.begin(), arr.end());
  lli f=0;
  lli award=0;
  for(auto ele:arr)
  {
    f=f+ele.first;
    award=award+(ele.second-f);

  }

  cout<<award;
  return 0;
}