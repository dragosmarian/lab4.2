package first;

import java.util.Random;

public class RandomOutTask implements Task {
    private int number;

    public RandomOutTask() {
        Random x = new Random();
        number = x.nextInt();
    }

    public void execute(){
        System.out.println(number);
    }
}
