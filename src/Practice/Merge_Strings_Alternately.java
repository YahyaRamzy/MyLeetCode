package Practice;
// Solved!
// 28/4/2024
// Difficulty : Easy
public class Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2){
        int LengthWord1 = word1.length();
        int LengthWord2 = word2.length();
        int min = Math.min(LengthWord1,LengthWord2);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if(LengthWord1!=LengthWord2) {
            if (min == LengthWord1) {
                String left = word2.substring(min);
                sb.append(left);
            } else {
                String left = word1.substring(min);
                sb.append(left);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String x = mergeAlternately("abc","pqr");
        System.out.println(x);
    }

}
