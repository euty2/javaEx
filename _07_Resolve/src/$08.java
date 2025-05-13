public class $08 {
    public static void main(String[] args) {
        // 8. 정수 배열 5개를 할당하고
        //     Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요
        int[] num = {23, 12, 34, 56, 45};

        int min = num[0];
        int max = num[0];
        
        // 최소값, 최대값 구하기
        for(int i = 0;i < num.length; i++){
            if(num[i] < min)
                min = num[i];
            if(num[i] > max)
                max = num[i];
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
    }
}
