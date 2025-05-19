package $03;

import java.util.Random;

public class GeneratorThreeNum {
    Random random = new Random();

    int num1 = random.nextInt(9)+1;
    int num2 = random.nextInt(9)+1;
    int num3 = random.nextInt(9)+1;
    
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
}
