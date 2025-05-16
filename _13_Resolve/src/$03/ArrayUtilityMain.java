package $03;

import java.util.Arrays;

// 3. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
//   static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
//   static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환
public class ArrayUtilityMain {
    public static void main(String[] args) {
        // 예제 int 배열
        int[] intArray = {1, 2, 3, 4, 5};

        // int → double 변환
        double[] doubleArray = ArrayUtility.intToDouble(intArray);
        System.out.println("int → double: " + Arrays.toString(doubleArray));

        // 예제 double 배열
        double[] doubleSource = {3.14, 2.71, 5.99, 1.0};

        // double → int 변환
        int[] intResult = ArrayUtility.doubleToInt(doubleSource);
        System.out.println("double → int: " + Arrays.toString(intResult));
    }
}
