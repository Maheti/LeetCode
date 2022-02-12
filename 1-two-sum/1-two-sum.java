class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i,j,l=nums.length;
        int a[]=new int[2];
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if((target-nums[i])==nums[j])
                { 
                    a[0]=i;
                    a[1]=j;
                 
                }
            }
        }
        return a;
    }
}