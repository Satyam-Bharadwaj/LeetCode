/**
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-22nd-september-28th/3470/
 * 
 * 
 */

//O(N^2)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int [] positionalCost = new int[gas.length];
        
        for(int i =0;i<gas.length;i++){
            positionalCost[i]= gas[i]- cost[i];
        }
        
        int lefthalfRequirement = 0;
        for(int i =0;i<gas.length;i++){

            if(positionalCost[i]<0){
                lefthalfRequirement +=positionalCost[i];
                continue;
            }
            if(positionalCost[i]==0&& gas.length>1){
                return -1;
            }
            int gasAvailable =0;
            int j;
            for( j =i;j<gas.length;j++){
                if(positionalCost[j]+gasAvailable <0){
                    break;
                    
                }
                gasAvailable+=positionalCost[j];
                
            }
            if(gasAvailable+lefthalfRequirement>=0&&j==gas.length)return i;
            lefthalfRequirement+=positionalCost[i];            
            

        }
        return -1;
    }
}

//O(N)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       
        int potentialStart =0;
        int sumOfGasSoFar=0;
        int totalGas=0;
        for(int i =0;i<gas.length;i++){
            int gasLeft = gas[i]-cost[i];
            
            if(sumOfGasSoFar>=0){
                sumOfGasSoFar+=gasLeft;
            }else{
                sumOfGasSoFar=gasLeft;
                potentialStart=i;
            }
            totalGas+=gasLeft;
                    
        }
        
        if(totalGas>=0) return potentialStart;
        return -1;
    }
}


