import java.util.Scanner;
# FIX
public class $05 {
    public static void main(String[] args) {
        // 5. int배열을 10개 생성하세요.
        //     사용자로부터 10개의 값을 입력받고
        //     순서대로 출력하고  총합을 구하세요
        int[] num = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("10개의 값을 입력하세요 : ");

        for(int i = 0;i < num.length;i++){
            num[i] = sc.nextInt();
            System.out.println(num[i])    
        }
        
    }
}
