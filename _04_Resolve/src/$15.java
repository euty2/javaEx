import java.util.Scanner;

public class $15 {
    public static void main(String[] args) {
        // 15. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
        //     삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 정수를 하나 입력하세요 : ");
        int num0 = sc.nextInt();
        System.out.print("둘째 정수를 하나 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("셋째 정수를 하나 입력하세요 : ");
        int num2 = sc.nextInt();
        
        // if(a + b > c)
        //     System.out.println("삼각형 입니다.");
        // else if(a + c > b)
        //     System.out.println("삼각형 입니다.");
        // else if(b + c > a)
        //     System.out.println("삼각형 입니다.");
        // else
            // System.out.println("삼각형이 아닙니다.");

        String result = (((num1+num2) > num0) && ((num0 + num2) > num1) && ((num0 + num1) > num2)) ?
        "삼각형을 만들 수 있습니다.":
        "삼각형을 만들지 못합니다.";

        System.out.println(result);

        sc.close();
    }
}
