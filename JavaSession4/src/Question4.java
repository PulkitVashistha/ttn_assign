import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private double age;
    private double salary;
    private String name;
    
    public Employee(int age, double salary, String name) {
        
        this.age=age;
        this.salary=salary;
        this.name=name;
        
    }
    
    @Override
    public int compareTo(Employee E) {
        if(age==E.age)
            return 0;
        else if(age>E.age)
            return 1;
        else
            return -1;
    }
    
    @Override
    public String toString() {
        return "\nAge: "+age+" Salary: "+salary+" Name: "+name;
    }
}

public class Question4 {
    
    public static void main(String[] args) {
        
        Employee E1,E2,E3;
        E1=new Employee(25,45896,"Shubham");
        E2=new Employee(26,45786,"Kunal");
        E3=new Employee(22,65945,"Vivek");
    
        List<Employee> list=new ArrayList<>();
        
        list.add(E1);
        list.add(E2);
        list.add(E3);
    
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);
        
    }

}
