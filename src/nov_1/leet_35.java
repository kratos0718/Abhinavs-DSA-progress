package nov_1;

public class leet_35 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=5;
        System.out.println(new Solution().searchInsert(nums,target));
    }
}

class Solution {
    public int searchInsert(int[] nums,int t){
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=(l+r)>>>1;
            if(nums[m]==t) return m;
            if(nums[m]<t) l=m+1; else r=m-1;
        }
        return l;
    }
}
