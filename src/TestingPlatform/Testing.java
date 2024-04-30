package TestingPlatform;

public class Testing {
//    public static String appendNewDerivation(String currentDerivation, String newPart) {
//        // Split the derivation into parts
//        String[] parts = currentDerivation.split(";");
//        if (parts.length == 0) {
//            return newPart.equals("e") ? "" : newPart;  // If no parts, start with new part or empty
//        }
//
//        // Focus on the last part of the derivation
//        String lastPart = parts[parts.length - 1];
//
//        // Find the leftmost variable (non-terminal)
//        int pos = -1;
//        for (int i = 0; i < lastPart.length(); i++) {
//            if (Character.isUpperCase(lastPart.charAt(i))) {
//                pos = i;
//                break;
//            }
//        }
//
//        // Create a new part for the derivation
//        String newSegment;
//        if (pos != -1) {
//            StringBuilder newSegmentBuilder = new StringBuilder(lastPart);
//            if (newPart.equals("e")) {
//                // Remove the variable completely if the new part is 'e'
//                newSegmentBuilder.deleteCharAt(pos);
//            } else {
//                // Replace the variable with the new part
//                newSegmentBuilder.replace(pos, pos + 1, newPart);  // Assuming the variable is one character long
//            }
//            newSegment = newSegmentBuilder.toString();
//        } else {
//            // If no variable is found, simply use the last part or append the new part if it's not 'e'
//            newSegment = newPart.equals("e") ? lastPart : lastPart + newPart;
//        }
//
//        // Append the new segment to the overall derivation
//        return currentDerivation + ";" + newSegment;
//    }

    public static void main(String[] args) {
//        // Example usage
//        String derivation = "S;AaS;aS";
//        String newPart = "e";
//
//        // Update the derivation by adding a new modified part
//        String updatedDerivation = appendNewDerivation(derivation, newPart);
//        System.out.println("Updated Derivation: " + updatedDerivation);
    }
//    public static void main(String[] args) {
//        String x = "ABAB";
//        String y = "ABABAB";
//        //System.out.println(x.substring(0,4));
//
////        for (int i = 0; i < x.length(); i++) {
////            String xy = x.substring(0,i+1);
////            System.out.println(xy);
////
////        }
//
//        int len1 = x.length();
//        int len2 = y.length();
//
//        for (int i = Math.min(len1,len2); i >0 ; i--) {
//            System.out.println(x.substring(0,i));
//        }
//    }
}
