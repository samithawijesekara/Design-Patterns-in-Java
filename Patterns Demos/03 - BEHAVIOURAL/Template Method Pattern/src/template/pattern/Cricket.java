package template.pattern;


public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket game initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game startPlay");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game endPlay");
    }
    
}
