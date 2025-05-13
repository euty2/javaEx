import java.util.Scanner;

public class $01Method {
    public static int getMax(int num1, int num2){
        return (num1 > num2) ? num1 : num2;
    }

    public static int getMin(int num1, int num2){
        return (num1 < num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        // 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
        //     작은 값을 반환하는 메서드를 작성하고 사용하세요
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        int max = getMax(num1, num2);
        int min = getMin(num1, num2);

        System.out.println("더 큰 값은 : " + max);
        System.out.println("더 작은 값은 : " + min);

        sc.close();
    }
}
