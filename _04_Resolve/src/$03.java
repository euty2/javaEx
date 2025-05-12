public class $03 {
    public static void main(String[] args) {
        // 3. while문을 이용해서 1부터 10까지 합을 출력하세요
        int num = 1;
        int sum = 0;
        
        while(num <= 10){
            sum = sum + num;
            num++;
        }
        System.out.println(sum);
    }
}
