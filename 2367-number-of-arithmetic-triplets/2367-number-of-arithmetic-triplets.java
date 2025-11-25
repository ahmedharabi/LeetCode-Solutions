class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        int j=nums.length-1;
        int ans=0;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            j=nums.length-1;
            while(i<j){System.out.println(nums[i]+" "+nums[j]);
            if((nums[j]-nums[i])==diff){arr.add(j);System.out.println("jawna behi");}
            j--;
            }
        }
        System.out.println(arr);
        int k=nums.length-1; 
        
        
        for(j=0;j<arr.size();j++){
            k=nums.length-1; 
            while(j<k){
            if(nums[k]-nums[arr.get(j)]==diff)ans++;
            k--;
            
        }  }
        return ans;
    }
}