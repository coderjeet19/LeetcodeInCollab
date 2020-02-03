class Problem219 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0)
            return 0;
        int i=0, j=0;
        int l=nums.length;
        int sum=nums[0];
        int minLength = Integer.MAX_VALUE;
        if (sum>=s){
            minLength=minLength<(j-i+1)?minLength:(j-i+1);
        }
        do{
            if (sum<s){
                j++;
                if (j<l) {
                    sum+=nums[j];    
                }
            }
            else{
                sum-=nums[i];
                i++;
            }
            if (sum>=s){
                minLength=minLength<(j-i+1)?minLength:(j-i+1);
            }
            // System.out.println(i+" "+j+" "+sum+" "+minLength);
        }while(j<l);
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
