package $02;

public class TabletMain {
    public static void main(String[] args) {
        TabletTester tabletTester = new TabletTester();
        ITablet[] tabletArr = {new SamsungTablet(), new SonyTablet(), new LGTablet()};
        int[] score = {0, 0, 0};

        for(int i=0;i<tabletArr.length;i++){
            tabletTester.setTest_num(3);
            tabletTester.setTablet(tabletArr[i]);

            score[i] += tabletTester.movieMusicReadBookTest();
            System.out.println("---------------------------------------");
        }
        for(int i=0;i<tabletArr.length;i++){
            System.out.println("[ " + tabletArr[i].getClass().getName() + " ] : " + score[i]);
        }
        System.out.println();        
    }
}
