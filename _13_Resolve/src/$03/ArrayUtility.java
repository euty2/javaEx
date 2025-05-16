package $03;

public class ArrayUtility {

    // int[] → double[] 변환
    public static double[] intToDouble(int[] source) {
        double[] result = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = (double) source[i];
        }
        return result;
    }

    // double[] → int[] 변환
    public static int[] doubleToInt(double[] source) {
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = (int) source[i];  // 소수점 버림
        }
        return result;
    }
}

