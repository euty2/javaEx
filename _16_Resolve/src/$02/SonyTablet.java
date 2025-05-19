package $02;

public class SonyTablet implements ITablet {

    @Override
    public void movie() {
        System.out.println("소니 타블렛으로 무비를 시청합니다.");
    }

    @Override
    public void music() {
        System.out.println("소니 타블렛으로 음악을 듣습니다.");
    }

    @Override
    public void readBook() {
        System.out.println("소니 타블렛으로 이북을 읽습니다.");
    }
}
