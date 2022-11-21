package template.pattern;


public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football game initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Football game startPlay");
    }

    @Override
    void endPlay() {
        System.out.println("Football game endPlay");
    }
    
}
