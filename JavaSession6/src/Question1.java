class Employeee {
    
    private static Employeee employeee=null;
    private int id;
    private String name;
    private long salary;
    
    private Employeee() {
        this.id=0;
        this.name="Default";
        this.salary=0L;
    }
    
    private Employeee(int id, String name, long salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public static Employeee getInstance() {
        if(employeee==null) {
            synchronized (Employee.class) {
                if(employeee==null) {
                    employeee=new Employeee();
                }
            }
        }
        return employeee;
    }
    
    @Override
    public String toString() {
        return "Serial: "+id+"\nName: "+name+"\nSalary: "+salary;
    }

}

public class Question1 {
    
    public static void main(String[] args) {
    
        Employeee employeee=Employeee.getInstance();
    
        System.out.println(employeee.toString());
    
    }
    
}
