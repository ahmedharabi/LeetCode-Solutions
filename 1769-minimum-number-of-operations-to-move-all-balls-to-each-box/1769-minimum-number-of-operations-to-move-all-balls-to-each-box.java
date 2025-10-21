class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1')arr.add(i);
        }
        int[] ans=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int s=0;
            for(int j=0;j<arr.size();j++){
                s+=Math.abs(arr.get(j)-i);
                //System.out.println(Math.abs(j-i));
            }
            ans[i]=s;
        }
        return ans;
    }
}