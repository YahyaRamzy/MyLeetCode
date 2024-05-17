package Practice;

public class Two_Sum_II_Input_Array_Is_Sorted_167 {
    public int[] twoSum(int[] numbers, int target) {
        // we will use 2 pointers and each time check if the number is bigger than our target we move the right pointer to decrease our result , then check again if  the number is smaller than our target we move the pointer to the left
        int left = 0;
        int right = numbers.length-1;
        int[] answer = new int[2];

        while(left<right){
            int n = numbers[left] + numbers[right];
            if(n == target){
                answer[0] = left +1;
                answer[1] = right +1;
                return answer;
            }else if(n > target){
                right--;
            }else{
                left++;
            }
        }
        int[] answ = new int[0];
        return answ;
    }
}
