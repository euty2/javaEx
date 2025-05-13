import java.util.Arrays;

public class $9 {
    public static void main(String[] args) {
        // 9. 정수 배열 5개를 할당하고
        //     System.out.println(Arrays.toString(numArr));
        //     로 배열을 출력했을 때 거꾸로 출력되도록
        //     배열의 값을 거꾸로 저장하세요.
        int[] numArr = {23, 12, 34, 56, 45};

        System.out.println(Arrays.toString(numArr));
        
        for(int i=numArr.length-1;i >= 0;i--){
            System.out.print(numArr[i] + " ");
        }
        
    }
}
