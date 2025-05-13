import java.util.Scanner;

public class $02Method {
    public static int abs(int num1, int num2){
        return Math.abs(num1-num2);
    }

    public static void main(String[] args) {
        // 2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
        //     사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
        //     절대값이 계산되어서 출력되어야 합니다
        Scanner sc = new Scanner(System.in);
        
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();;

        int result = abs(num1, num2);

        System.out.println(result);

        sc.close();
    }
}
