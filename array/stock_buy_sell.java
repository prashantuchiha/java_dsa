class Solution {
    public int maxProfit(int[] prices) {
        int maxsofar=0;
        int maxatend=0;
        int a=0;
        for(int i=0;i<prices.length-1;i++){
            a=prices[i+1]-prices[i];
            if(maxatend+a>0){
                maxatend=maxatend+a;
            }else{maxatend=0;}
           
            maxsofar=Math.max(maxsofar,maxatend);
        }
        return maxsofar;
    }
    
}