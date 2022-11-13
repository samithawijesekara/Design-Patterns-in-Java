package builder.pattern;


public class EmployeeBuilder {
    
    private String name;
    private int age;
    private String address;
    private int idNumber;
    private String position;
    
    public EmployeeBuilder setName(String name){
        this.name = name;
        return this;
    }
    
    public EmployeeBuilder setAge(int age){
        this.age = age;
        return this;
    }
    
    public EmployeeBuilder setAddress(String address){
        this.address = address;
        return this;
    }
        
    public EmployeeBuilder setIdNumber(int idNumber){
        this.idNumber = idNumber;
        return this;
    }
            
    public EmployeeBuilder setPosition(String position){
        this.position = position;
        return this;
    }
    
    public Employee getEmployee(){
        return new Employee(name, age, address, idNumber, position);
    }
    
}
