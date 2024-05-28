package union_find;

public class LinearUnionFind {
    private int[] arr;
    public LinearUnionFind(int n){
        arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = i;
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
        int qid = root(q);
        int pid = root(p);
        arr[pid] = qid;
    }

    public int[] getArr() {
        return arr;
    }
}
