class Solution {
    public int[] leftRightDifference(int[] nums) {
        ArrayList<Integer> leftSum = new ArrayList<>();
        ArrayList<Integer> rightSum = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        leftSum.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            leftSum.add(leftSum.get(i - 1) + nums[i]);
        }
        rightSum.add(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum.add(rightSum.get(rightSum.size()-1) + nums[i]);
        }
        Collections.reverse(rightSum);
        for (int i = 0; i < nums.length; i++) {
            answer.add(Math.abs(leftSum.get(i) - rightSum.get(i)));
        }
        
        System.out.println(leftSum);
        System.out.println(rightSum);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}