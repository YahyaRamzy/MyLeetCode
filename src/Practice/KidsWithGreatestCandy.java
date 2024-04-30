package Practice;

import java.util.ArrayList;
import java.util.List;

//Solved Difficulty : Easy
public class KidsWithGreatestCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>(candies.length);
        for(int i : candies){
            if(i>max){
                max = i;
            }
        }
        int[] candiesAdded = new int[candies.length];
        for (int i = 0; i < candiesAdded.length; i++) {
            candiesAdded[i] = candies[i] + extraCandies;
        }

        for (int i = 0; i < candiesAdded.length; i++) {
            if(candiesAdded[i] >=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> res = new ArrayList<>();
        //res = KidsWithGreatestCandy(candies,extra);
    }
}
