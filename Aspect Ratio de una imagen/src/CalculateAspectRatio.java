public class CalculateAspectRatio {
    

    public static String calculateAspectRatio(int width, int height){
        int gcd = gcd(width, height);
        int aspectWidth = width / gcd;
        int aspectHeight = height / gcd;
        return aspectWidth + ": " + aspectHeight;
    }

    private static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a %b);
    }
}
