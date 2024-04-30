package Practice;
//Solved
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int pointer = 1;
        if(flowerbed.length ==1 & flowerbed[0] ==0 & n==1){
            return true;
        }
        if(flowerbed.length ==2 ){
            if(flowerbed[0] ==0 & flowerbed[1] ==0 & n==1) {
                return true;
            }
        }
        while(pointer <= flowerbed.length-2){
            if(n==0){break;}

            if(flowerbed[0] == 0 & flowerbed[1] == 0){
                flowerbed[0] = 1;
                n--;
                if(n==0){break;}
            }
            if(flowerbed[flowerbed.length-1] == 0 & flowerbed[flowerbed.length-2] == 0){
                flowerbed[flowerbed.length-1] = 1;
                n--;
                if(n==0){break;}
            }
            if((flowerbed[pointer] == 0) & (flowerbed[pointer+1] == 0) & (flowerbed[pointer-1] ==0)){
                flowerbed[pointer] = 1;
                n--;
                if(n==0){break;}
            }
            pointer++;
        }
        return n == 0;
    }
    public static void main(String[] args) {
        int[] flowers = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowers,n));
    }
}
