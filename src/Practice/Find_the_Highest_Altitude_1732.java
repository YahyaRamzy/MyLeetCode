package Practice;

public class Find_the_Highest_Altitude_1732 {
    public int largestAltitude(int[] gain) {
        // we make an altitude array with the first element being 0
        // then we loop on the gain array and add to the altitude the current gain + (the prev altitude) prefix sum !
        // then we loop on the altitude and get the highest nubmer and return it

        int[] altitudes = new int[(gain.length + 1)];
        altitudes[0] = 0;
        // gain = [-5,1,5,0,-7]
        // altitude = [0,-5 ,-4 ,1 ,1 ,-6 ]
        // i = 1
        for(int i = 0 ; i < gain.length ; i++){
            altitudes[i+1] = gain[i] + altitudes[i];
        }

        //then we get max
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i< altitudes.length;i++){
            if(altitudes[i] > max){
                max = altitudes[i];
            }
        }

        return max;


    }
}
