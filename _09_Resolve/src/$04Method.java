import java.util.Scanner;

public class $04Method {
    public static void gugudan(int num){
        for(int i=1;i<10;i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }

    public static void main(String[] args) {
        // 4. gugudan(3);   
        //     구구단 메서드를 void 리턴형으로 제작하세요.
        //     3을 입력하면 3단이 출력됩니다.
        System.out.print("구구단 단을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        gugudan(num);
    }
}
