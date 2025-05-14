import java.util.Scanner;
# FIX
public class $05 {
    public static void main(String[] args) {
        // 5. int배열을 10개 생성하세요.
        //     사용자로부터 10개의 값을 입력받고
        //     순서대로 출력하고  총합을 구하세요
        int[] arr = new int[10];
        int total = 0;

        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i < arr.length;i++){
            System.out.print("10개의 값을 입력하세요 : ");
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);  
        }
        
        for(int num : arr){
            System.out.println(num + " ")
            total += num;
        }
        System.out.println();
        System.out.println("총합 : " + total);
    }
}
