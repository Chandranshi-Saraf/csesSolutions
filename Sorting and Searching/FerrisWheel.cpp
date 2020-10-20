#include<bits/stdc++.h>
    using namespace std;

int main() {
  int n, x;
  cin >> n >> x;
  vector<int> a(n);
  for (int i = 0; i < n; i++) 
    cin >> a[i];
  sort(a.begin(), a.end());
  int i = 0;
  int j = n - 1;
  int c = 0;
  while (i <= j) {
    if (a[j] + a[i] > x) j--;
    else { 
      i++; 
      j--; 
    }
    c++;
  }
  cout << c << endl;
}