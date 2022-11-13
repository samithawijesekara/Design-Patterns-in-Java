package factorymethodpattern;


public class Main {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone myPhone = phoneFactory.getPhone("Low Price");
        myPhone.showSpecs();
    }
    
}
