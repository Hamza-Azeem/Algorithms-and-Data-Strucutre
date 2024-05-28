package union_find;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuadraticUnionFind {
    int n;
    int[] arr;
    public QuadraticUnionFind(int n){
        arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = i;
    }
    public boolean isConnected(int p, int q){
        if(arr[p] == arr[q]){
            return true;
        }
        else{
            return false;
        }
    }
    public void union(int p, int q){
        int pid = arr[p];
        int qid = arr[q];
        for(int i=0;i<arr.length;i++){
            if(pid == arr[i])
                arr[i] = qid;
        }
    }
    int[] getArr(){
        return arr;
    }
}
