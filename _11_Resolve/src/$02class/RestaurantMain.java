package $02class;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Restaurant rest = new Restaurant(sc, "중국집", new String[]{"짜장면", "짬뽕",
                                  "볶음밥", "탕수육"});
        
        rest.viewMenu();
        rest.selectFood();
        rest.deliveryFood();

        sc.close();
    }
}
