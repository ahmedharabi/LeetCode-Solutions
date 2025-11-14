class Solution {
    public int pivotIndex(int[] nums) {
        
        ArrayList<Integer> prefix=new ArrayList<>();
        ArrayList<Integer> suffix=new ArrayList<>();
        prefix.add(nums[0]);
        suffix.add(nums[nums.length-1]);
        for(int i=1;i<nums.length;i++){
            prefix.add(prefix.get(i-1)+nums[i]);
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix.add(suffix.get(suffix.size()-1)+nums[i]);
        }
        Collections.reverse(suffix);
        if(nums.length>9239){System.out.println(suffix.get(9239));
        System.out.println(prefix.get(9237));}
        


        
        for(int i=0;i<prefix.size();i++){
            
            if(i!=suffix.size()-1 && i!=0 && suffix.get(i+1)-prefix.get(i-1)==0){return i;}
            else if(i==0 && suffix.get(1)==0){System.out.println("aha");return 0;}
            else if(i==prefix.size()-1 && prefix.get(prefix.size()-2)==0){return i;}
        }
        return -1;


        


    }
}