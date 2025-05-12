public class $07 {
    public static void main(String[] args) {
        // 7. do~while문을 이용해서 1부터 10까지 합을 출력하세요
        int num = 0;
        int sum = 0;
        do{
            num++;
            sum = sum + num;
        } while(num < 10);
        
        System.out.println(sum);
    }
}
