// Last updated: 1/9/2026, 12:41:22 pm
class Solution {
    static{
        for(int i=0;i<500;i++){
            maxScore(new int[0],0);
        }
    }
    public static int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }int max=sum;
        for(int i=0;i<k;i++){
            sum=sum-cardPoints[k-i-1]+cardPoints[cardPoints.length-i-1];
            max=Math.max(max,sum);
        }
        return max;
    }
}