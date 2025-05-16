package $02;

import java.util.Scanner;

// 2. 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의합니다
//    생성과 동시에 초기화가 가능한 생성자도 정의합니다
//    밑변과 높이 정보를 변경시킬 수 있는 메소드를 정의합니다
//    삼각형의 넓이를 계산해서 반환하는 메소드도 정의합니다
//    객체를 만들어서 사용해보세요
public class $02 {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("밑변을 입력하세요 : ");
        // int width = sc.nextInt();
        // System.out.print("높이를 입력하세요 : ");
        // int height =sc.nextInt();

        Triangle tri = new Triangle(5, 10);
        tri.calculate(5, 10);
    }
}
#FIX