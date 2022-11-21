package strategy.pattern;


public class Main {


    public static void main(String[] args) {
        Context context = new Context(new BubbleSort());
        System.out.println(context.executeAlgorithm(20, 50));
    }
    
}
