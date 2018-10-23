package third;

import second.Container;
import second.Queue;
import second.Stack;

public class ContainerFactory implements IFactory {
    public static final ContainerFactory INSTANCE = new ContainerFactory();

    private ContainerFactory() {
    }

    public Container createContainer(Strategy strategy) {
        if (strategy == Strategy.LIFO){
            return new Stack();

        }
        return new Queue();

    }
}