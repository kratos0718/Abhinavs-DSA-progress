package nov_1;

import java.util.*;

public class leet_46 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(new Solution46().permute(a));
    }
}

class Solution46 {
    private List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] a){
        back(a,0);
        return res;
    }
    private void back(int[] a,int i){
        if(i==a.length){
            List<Integer> cur=new ArrayList<>();
            for(int v:a) cur.add(v);
            res.add(cur);
            return;
        }
        for(int j=i;j<a.length;j++){
            int t=a[i];a[i]=a[j];a[j]=t;
            back(a,i+1);
            t=a[i];a[i]=a[j];a[j]=t;
        }
    }
}
