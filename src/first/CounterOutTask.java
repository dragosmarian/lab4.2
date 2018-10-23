package first;

public class CounterOutTask implements Task {
    private int counter = 0;

    public void execute(){
        counter++;
    }
}
