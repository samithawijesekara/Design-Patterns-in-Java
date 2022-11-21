package strategy.pattern;


public class Context {
    
    private Algorithm algorithm;
    
    public Context(Algorithm algorithm){
        this.algorithm = algorithm;
    }
    
    public String executeAlgorithm(int num1, int num2){
      return algorithm.sorting(num1, num2);
   }
}
