#include<bits/stdc++.h>
    using namespace std;

int main() {
  int n;
  cin >> n;
  vector<int> arrival(n);
  vector<int> dept(n);
  for (int i = 0; i < n; i++) 
    cin >> arrival[i] >> dept[i];
  sort(arrival.begin(),arrival.end());
  sort(dept.begin(),dept.end());
  int i=1;
  int j=0;
  int count=1;
  int max=-99;
  while(i<n && j<n)
    {
        if(arrival[i]<=dept[j]){
            count++;
            i++;
        }
        else if (arrival[i] > dept[j]) { 
            count--; 
            j++; 
        }
            
        if(count>max)
            max=count;

    }
  cout << max << endl;
}