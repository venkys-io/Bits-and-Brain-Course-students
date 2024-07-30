#include<bits/stdc++.h>
using namespace std;

void solve(int n){
    for(int i=0; i<n; ++i){
        // space 
        for(int i=n-i-1; i>=0; ++i){
            cout<<" ";
        }
        // stars
        for(int i=0; i<2*i+1; ++i){
            cout<<"*";
        }
        // space 
        for(int i=n-i-1; i>=0; ++i){
            cout<<" ";
        }
    }
}

int main(){
    int n;
    cin>>n;
    solve(n);
}