import java.util.Scanner;

public class $18 {
    public static void main(String[] args) {
        // 8. 입력받은 숫자의 구구단을 출력하세요
        //     예를 들어 3을 입력하면 
        //     3 x 1 = 3
        //     3 x 2 = 6
        //     ...
        //     3 x 9 = 27
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 단을 입력해주세요 : ");
        int num = sc.nextInt();
        for(int i = 1;i < 10;i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}
