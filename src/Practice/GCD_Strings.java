package Practice;

//Solved
// Difficulty : Easy
// Bas i dont like the solution i made , alot of code.
public class GCD_Strings {

    public String gcdOfStrings(String str1, String str2) {
        //Solution 1
        String answer = "";
        if(str1.equals(str2)){
            return str1;
        }

        if(str1.length() > str2.length()){
            for (int i = 0; i < str2.length(); i++) {
                String x = str2.substring(0,i+1);
                if(str2.length() % x.length() ==0){
                    StringBuilder y = new StringBuilder();
                    for (int j = 0; j < str2.length()/x.length(); j++) {
                        y.append(x);
                    }
                    if(y.toString().equals(str2)){
                        if(str1.length()%x.length() ==0){
                            StringBuilder yx = new StringBuilder();
                            for (int j = 0; j < str1.length()/x.length(); j++) {
                                yx.append(x);
                            }
                            if(yx.toString().equals(str1)){
                                if(x.length()>answer.length()){
                                    answer=x;
                                }

                            }
                        }
                    }
                }
            }
        }else{
            for (int i = 0; i < str1.length(); i++) {
                String x = str1.substring(0,i+1);
                if(str1.length() % x.length() ==0){
                    StringBuilder y = new StringBuilder();
                    for (int j = 0; j < str1.length()/x.length(); j++) {
                        y.append(x);
                    }
                    if(y.toString().equals(str1)){
                        if(str2.length()%x.length() ==0){
                            StringBuilder yx = new StringBuilder();
                            for (int j = 0; j < str2.length()/x.length(); j++) {
                                yx.append(x);
                            }
                            if(yx.toString().equals(str2)){
                                if(x.length()>answer.length()){
                                    answer=x;
                                }
                            }
                        }
                    }
                }
            }
        }


        return answer;

        //Solution 2

//        int len1 = str1.length();
//        int len2 = str2.length();
//
//        for (int i = Math.min(len1,len2); i >0 ; i--) {
//            if(isDivisor(i,len1,len2,str1,str2)){
//                return str1.substring(0,i);
//            }
//            else {
//                return "";
//            }
//        }
//        return str1;
    }

    public boolean isDivisor(int l , int len1 , int len2 , String str1 , String str2){
        if(len1%l != 0| len2%l != 0){
            return false;
        }else{
            int f1 = len1/l;
            int f2 = len2/l;

            return str1.equals(str1.substring(0,l).repeat(f1)) & str2.equals(str1.substring(0,l).repeat(f2));
        }

    }



}
