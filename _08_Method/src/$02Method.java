import java.util.Scanner;

public class $02Method {
    // op, num0, num1은 main의 op, num0, num1과 소속이 다르다.
    // main에서 호출하면 값만 전달되는 것이다.
     public static int calcArith(String op, int num0, int num1){
        int result = 0;

        switch(op){
            case "+":
                result = num0 + num1;
                break;
            case "-":
                result = num0 - num1;
                break;
            case "*":
                result = num0 * num1;
                break;
            case "/":
                result = num0 / num1;
                break;
            case "%":
                result = num0 % num1;
                break;
            default:
                System.out.println("연산이 불가능합니다.");
                break;
        }
        // 메서드를 호출한 곳으로 result값을 가지고 돌아가라.
        // (이 메서드의 업무처리가 끝나고 결과보고)
        return result;
    }
    // void는 처리만 하고 아무것도 return하지 않은 다는 의미
    public static void viewResult(int result){
        System.out.println("결과값은 " + result + "입니다.");
    }

    public static void main(String[] args) throws Exception {
        // 사칙연산 메서드 분리

        /*사칙연산 입력-연산-출력 */
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 정수 입력 >> ");
        int num0 = sc.nextInt();
        System.out.print("2번째 정수 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("연산자 입력(+ - * / %) >> ");
        String op = sc.next();
        int result = 0;

        result = calcArith(op, num0, num1);     // 사칙 연산
    viewResult(result);                         // 결과 출력

        sc.close();
    }
}
