package $01;
public class Div {
    private int a;
    private int b;

    public Div(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int calculate(int a, int b){
        int result = a / b;
        System.out.printf("나눗셈은 : %d", result);
        return result;
    }
}
