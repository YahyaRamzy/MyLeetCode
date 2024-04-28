package TestingPlatform;

public class Testing {

    public static void main(String[] args) {
        String x = "ABAB";
        String y = "ABABAB";
        //System.out.println(x.substring(0,4));

//        for (int i = 0; i < x.length(); i++) {
//            String xy = x.substring(0,i+1);
//            System.out.println(xy);
//
//        }

        int len1 = x.length();
        int len2 = y.length();

        for (int i = Math.min(len1,len2); i >0 ; i--) {
            System.out.println(x.substring(0,i));
        }
    }
}
