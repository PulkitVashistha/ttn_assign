import java.util.ArrayList;
import java.util.List;

//Component
interface Directory {
    void showDirectoryDetails();
}

//Leaf
class Employee implements Directory {
    
    private long e_id;
    private String name;
    private String designation;
    
    public Employee(long e_id, String name, String designation) {
        this.e_id=e_id;
        this.name=name;
        this.designation=designation;
    }
    
    public long getEID() {
        return e_id;
    }
    
    public void setEID(long e_id) {
        this.e_id = e_id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    @Override
    public void showDirectoryDetails() {
        System.out.println(
                "\nEmployee"+
                "\n{"+
                "\nID: "+e_id+
                "\nName: "+name+
                "\nDesignation: "+designation+
                "\n}");
    }
    
    @Override
    public String toString() {
        return "\nEmployee"+
                "\n{"+
                "\nID: "+e_id+
                "\nName: "+name+
                "\nDesignation: "+designation+
                "\n}";
    }
    
}

//Leaf
class Department implements Directory {
    
    private String department_name;
    
    public Department(String department_name) {
        this.department_name=department_name;
    }
    
    public String getDepartmentName() {
        return department_name;
    }
    
    public void setDepartmentName(String department_name) {
        this.department_name = department_name;
    }
    
    @Override
    public void showDirectoryDetails() {
        System.out.println(
               "\nDepartment"+
                "\n{"+
                "\nDepartment Name: "+department_name+
                "\n}");
    }
    
    @Override
    public String toString() {
        return "\nDepartment"+
                "\n{"+
                "\nDepartment Name: "+department_name+
                "\n}";
                
    }
}

//Composite
class EmployeeDirectory implements Directory {
    
    List<Employee> employeeDirectory=new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("Employee Directory\n");
        employeeDirectory.forEach(e->e.showDirectoryDetails());
    }
    
}

class DepartmentDirectory implements Directory {
    
    List<Department> departmentDirectory=new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("Department Directory\n");
        departmentDirectory.forEach(e->e.showDirectoryDetails());
    }
    
}

class CompanyDirectory implements Directory {
    
    List<Directory> companyDirectory=new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(e->e.showDirectoryDetails());
    }
    
}

public class Question7 {
    
    public static void main(String[] args) {
    
        Employee employee1=new Employee(1001L,"Shubham","SE");
        Employee employee2=new Employee(1002L,"Varnit","SE");
        
        Department department1=new Department("JVM");
        Department department2=new Department("MEEN");
        
        EmployeeDirectory employeeDirectory=new EmployeeDirectory();
        employeeDirectory.employeeDirectory.add(employee1);
        employeeDirectory.employeeDirectory.add(employee2);
        
        DepartmentDirectory departmentDirectory=new DepartmentDirectory();
        departmentDirectory.departmentDirectory.add(department1);
        departmentDirectory.departmentDirectory.add(department2);
        
        CompanyDirectory companyDirectory=new CompanyDirectory();
        companyDirectory.companyDirectory.add(employeeDirectory);
        companyDirectory.companyDirectory.add(departmentDirectory);
        
        companyDirectory.showDirectoryDetails();
    
    }

}
