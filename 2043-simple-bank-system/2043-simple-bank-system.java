class Bank {
    public ArrayList<Long> arr=new ArrayList<>();
    public Bank(long[] balance) {
        for(int i=0;i<balance.length;i++){
            arr.add(balance[i]);
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1-1 <arr.size() && account2-1 <arr.size() && arr.get(account1-1)>=money){
            System.out.println("ahlzz");
            arr.set(account1-1,arr.get(account1-1)-money);
            arr.set(account2-1,arr.get(account2-1)+money);
            return true;
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(account-1<arr.size()){
            arr.set(account-1,arr.get(account-1)+money);
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if(account-1<arr.size() && arr.get(account-1)>=money){
            arr.set(account-1,arr.get(account-1)-money);
            return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */