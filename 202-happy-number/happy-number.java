class Solution {
    public int sumOfSq(int n){
        int sum=0;
        while(n!=0){
            int reminder=n%10;
            sum=sum+(reminder*reminder);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(n!=1){
            if(s.contains(n)) return false;
            s.add(n);
            n=sumOfSq(n);

        }
        return true;
    }
}