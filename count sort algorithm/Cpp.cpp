void sort(vector<int> arr){
    int maxi = *max_element(arr.begin(),arr.end());
    int mini = *min_element(arr.begin(),arr.end());

    int range = maxi-mini+1;
    vector<int> count(range),output(arr.size());
    for(int i=0;i<arr.size();i++){
        count[arr[i]-mini]++;
    }
    for(int i=1;i<count.size();i++){
        count[i] += count[i-1];
    }
    for(int i=arr.size()-1;i>=0;i--){
        output[count[arr[i]-mini]-1] = arr[i];
        count[arr[i]-mini]--;
    }
}