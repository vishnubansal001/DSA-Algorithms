#include <bits/stdc++.h>

int majority(vector<int> vec,int n){
    int candi = -1, vote = 0;
    for(int i=0;i<n;i++){
        if(vote==0){
            candi = a[i];
            vote = 1;
        }
        else{
            if(a[i] == candi){
                vote++;
            }
            else{
                vote--;
            }
        }
    }
    int cnt = 0;
    for(int i=0;i<n;i++){
        if(a[i] == candi) cnt++;
    }
    return cnt > n/2 ? candi : -1;
}

int main(){
    int n;
    cin>>n;
    vector<int> vec(n,0);
    for(int i=0;i<n;i++){
        cin>>vec[i];
    }
    cout<<"Majority element is : "<<majority(vec,n)<<endl;
    return 0;
}