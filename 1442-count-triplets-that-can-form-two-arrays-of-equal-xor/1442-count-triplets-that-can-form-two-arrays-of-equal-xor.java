class Solution {
    public int countTriplets(int[] arr) {
        ArrayList<Integer> prefix=new ArrayList<>();
        ArrayList<Integer> suffix=new ArrayList<>();
        prefix.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            prefix.add(prefix.get(prefix.size()-1)^arr[i]);
        }
        suffix.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            suffix.add(suffix.get(suffix.size()-1)^arr[i]);
        }
        System.out.println(prefix);
        System.out.println(suffix);
        int ans=0;
        
        for(int i=0;i<prefix.size();i++){
            
            int xor=prefix.get(i);
            for(int j=i+1;j<prefix.size();j++){
                if((prefix.get(j)==xor))ans+=j-i-1;
            }

        }
        for(int i=0;i<prefix.size();i++){
            
            if(prefix.get(i)==0)ans+=i;

        }
        
        
        return ans;
    }
}