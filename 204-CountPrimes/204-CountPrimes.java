// Last updated: 1/9/2026, 12:42:30 pm
class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }boolean[] isprime=new boolean[n];
        int count=0;
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i*i<n;i++){
            if(isprime[i]){
                for(int j=i*i;j<n;j=j+i){
                    isprime[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(isprime[i]){
                count++;
            }
        }return count;
    }
}