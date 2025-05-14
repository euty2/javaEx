import java.util.Arrays;

public class $07 {
    public static void main(String[] args) {
        // 7. 정수 배열 5개를 할당하고
        //     Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
        int[] num = {23, 12, 34, 56, 45};

        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("최소값 : " + num[0]);
        System.out.println("최대값 : " + num[4]);
    }
}
