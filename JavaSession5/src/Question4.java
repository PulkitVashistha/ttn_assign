
@FunctionalInterface
interface GenericEmployee {
    Employee getEmployee(String arg1, int arg2, String arg3);
}

class Employee {
    String name;
    int age;
    String city;
    
    Employee(String name, int age, String city) {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    
    public String toString() {
        return "Name: "+name+" Age: "+age+" City: "+city;
    }
}

public class Question4 {
    
    public static void main(String[] args) {
    
        GenericEmployee genericEmployee=Employee::new;
        
        Employee employee=genericEmployee.getEmployee("Shubham Kumar",24,"Noida");
    
        System.out.println(employee.toString());
    
    }

}
