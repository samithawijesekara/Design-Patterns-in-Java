package factorymethodpattern;


public class PhoneFactory {
    
    
    public Phone getPhone(String phoneType){
        
        if(phoneType == null){
            return null;
        }else if(phoneType == "Low Price"){
            return new Samsung();
        }else if(phoneType == "Mid Price"){
            return new Huawei();
        }else if(phoneType == "High Price"){
            return new Iphone();
        }
        
        return null;
    } 
    
}
