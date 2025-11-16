class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer>arr=new ArrayList<>();
        int max=Math.max(0,gain[0]);
        arr.add(gain[0]);
        for(int i=1;i<gain.length;i++){
            arr.add(arr.get(i-1)+gain[i]);
            max=Math.max(max,arr.get(arr.size()-1));
        }
        return max;
    }
}