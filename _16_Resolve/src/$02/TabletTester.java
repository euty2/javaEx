package $02;

public class TabletTester {
    private final int TEST_SCORE = 50;
    private int test_num;
    private ITablet iTablet;

    public int getTest_num() {
        return this.test_num;
    }

    public void setTest_num(int test_num) {
        this.test_num = test_num;
    }

    public ITablet getTablet() {
        return this.iTablet;
    }

    public void setTablet(ITablet iTablet) {
        this.iTablet = iTablet;
    }

    private int getTestScore(){
        return (int)(Math.random() * TEST_SCORE) + TEST_SCORE;
    }

    public TabletTester(){
        this.test_num = 3;
    }

    public TabletTester(ITablet iTablet, int test_num){
        this.iTablet = iTablet;
        this.test_num = test_num;
    }

    public int movieMusicReadBookTest(){
        for(int i=0;i<this.test_num;i++){
            iTablet.movie();
            iTablet.music();
            iTablet.readBook();
        }
        return getTestScore();
    }
}
