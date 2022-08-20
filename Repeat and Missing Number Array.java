public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int[] map = new int[A.length + 1];
        
        //array map for numbers
        for(int i = 0; i< A.length; i ++) {
            //increasing count at index = A[i]
            map[A[i]]++;
        }
        
        int missing = 0;
        int repeat = 0;
        //start from index 1
        for(int i = 1; i < map.length; i++) {
            //for number repeating
            if(map[i] == 2) {
                repeat = i;
            }
            //for number did'nt came
            if(map[i] == 0) {
                missing = i;
            }
        }
        int[] result = new int[2];
        
        result[0] = repeat;
        result[1] = missing;
        
        return result;
        
        
        
    }
}

