class NumArray {

    public ArrayList<Integer> arr=new ArrayList<>();
    public NumArray(int[] nums) {
        //int s=0;
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            //s+=nums[i];
            arr.add(arr.get(i-1)+nums[i]);
        }
        System.out.println(arr);
    }
    
    public int sumRange(int left, int right) {
        return left!=0 ? arr.get(right)-arr.get(left-1) : arr.get(right);
        //return arr.get(right)-arr.get(left);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */