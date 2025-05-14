public class $02 {
    public static void main(String[] args) {
        // 2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
        String[] names = {"가이유", "나수니", "다이쁨", "라예쁜", "뭐에유", "바이유", "사이유", "아이유", "이이유", "김이유"};

        for(int i = names.length-1;i >= 0;i--){
            System.out.println(names[i]);
        }
    }
}
