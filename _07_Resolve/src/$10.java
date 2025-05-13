# FIX
public class $10 {
    public static void main(String[] args) {
        // 10. 정수 배열 5개를 할당하고
        //     Arrays.sort를 사용하지 말고
        //     배열을 오름차순으로 정렬하도록 저장하세요.
        //     그리고 출력하세요
        int[] numbers = {23, 12, 34, 56, 45};

        // 선택 정렬(오름차순)
        for(int i = 0;i < numbers.length;i++){
            for(int j = i;j < numbers.length;j++){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        System.out.print("오름 차순 결과 정렬: ");
        for(int num : numbers){
            System.out.println(num + " ")
        }
    }
}
