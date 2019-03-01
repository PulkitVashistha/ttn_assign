
class Student {
    
    private long roll;
    private String name;
    private String father_name;
    private String mobile;
    private String address;
    private boolean pass_status;
    
    public Student(StudentBuilder studentBuilder) {
        roll = studentBuilder.getRoll();
        name = studentBuilder.getName();
        father_name = studentBuilder.getFatherName();
        mobile = studentBuilder.getMobile();
        address = studentBuilder.getAddress();
        pass_status = studentBuilder.isPass();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Long getRoll() {
        return roll;
    }
    
    public void setId(Long roll) {
        this.roll = roll;
    }
    
    public String getFatherName() {
        return father_name;
    }
    
    public void setFatherName(String father_name) {
        this.father_name = father_name;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile=mobile;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public boolean isPass() {
        return pass_status;
    }
    
    public void setPass(boolean pass_status) {
        this.pass_status = pass_status;
    }
    
    
    @Override
    public String toString() {
        return "Student Details: "+
                "\n{" +
                "\nRoll=" + roll +
                "\nName=" + name +
                "\nFather Name=" + father_name +
                "\nMobile=" + mobile +
                "\nAddress=" + address +
                "\nPass Status=" + pass_status +
                "\n}";
    }
}

class StudentBuilder {
    
    private long roll;
    private String name;
    private String father_name;
    private String mobile;
    private String address;
    private boolean pass_status;
    
    public StudentBuilder(Long roll, String name) {
        this.name = name;
        this.roll = roll;
    }
    
    public String getName() {
        return name;
    }
    
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public Long getRoll() {
        return roll;
    }
    
    public StudentBuilder setRoll(Long id) {
        this.roll = roll;
        return this;
    }
    
    public String getFatherName() {
        return father_name;
    }
    
    public StudentBuilder withFatherName(String father_name) {
        this.father_name = father_name;
        return this;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public StudentBuilder withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    
    public String getAddress() {
        return address;
    }
    
    public StudentBuilder withAddress(String address) {
        this.address = address;
        return this;
    }
    
    public boolean isPass() {
        return pass_status;
    }
    
    public StudentBuilder withPass(Boolean pass_status) {
        this.pass_status=pass_status;
        return this;
    }
    
    
    public Student build() {
        return new Student(this);
    }
}


public class Question4 {
    
    public static void main(String[] args) {
    
        Student student = new StudentBuilder(52215104416L,"Shubham Kumar")
                .withFatherName("A K Mishra")
                .withMobile("7759851105")
                .withAddress("Patna")
                .withPass(true)
                .build();
    
        System.out.println(student);
    
    }
    
}
