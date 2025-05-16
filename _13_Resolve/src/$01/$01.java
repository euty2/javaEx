package $01;
// 1. 클래스 Add
//    클래스 Sub
//    클래스 Mul
//    클래스 Div을 만드세요
//    이들은 다음 필드와 메서드를 가집니다
//    int타입의 a, b 필드 : 연산하고자 하는 값
//    void setValue(int _a, int _b) : 연산값을 전달받아 필드에 저장
//    int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴합니다
public class $01 {
    public static void main(String[] args) {
        Add add = new Add(5, 5);
        add.calculate(5, 5);
        System.out.println();

        Sub sub = new Sub(5, 5);
        sub.calculate(5, 5);
        System.out.println();

        Mul mul = new Mul(5, 5);
        mul.calculate(5, 5);
        System.out.println();

        Div div = new Div(5, 5);
        div.calculate(5, 5);
        System.out.println();
    }
}
