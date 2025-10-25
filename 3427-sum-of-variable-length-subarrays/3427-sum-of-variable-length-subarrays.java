class Solution {
    public int subarraySum(int[] nums) {
        ArrayList<Integer>prefix=new ArrayList<>();
        
        prefix.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            prefix.add(prefix.get(prefix.size()-1)+nums[i]);
        }
        System.out.println(prefix);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
            System.out.println("start: "+start+ "i: "+i);
            int s;
            if(start==0)s=prefix.get(i);
            
            else s=prefix.get(i)-prefix.get(start-1);
            ans+=s;
            System.out.println("s= "+s);
        }
        return ans;
    }
}