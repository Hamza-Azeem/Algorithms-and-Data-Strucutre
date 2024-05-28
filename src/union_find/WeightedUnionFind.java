package union_find;

public class WeightedUnionFind {
    private int[] arr;
    private int[] size;

    public WeightedUnionFind(int n){
        arr = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i;
            size[i] = 1;
        }
    }
    private int root(int i){
        while(i != arr[i]){
            i = arr[i];
        }
        return i;
    }
    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }
    public void union(int p, int q){
        int pid = root(p);
        int qid = root(q);
        if(pid == qid) return;
        if(size[p] < size[q]){
            arr[pid] = qid;
            size[qid] += size[pid];
        }
        else{
         arr[qid] = pid;
         size[pid] += size[qid];
        }
    }

    public int[] getArr() {
        return arr;
    }
}
