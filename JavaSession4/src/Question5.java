import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private double score;
    private double age;
    
    public Student(String name, double score, double age) {
        
        this.name=name;
        this.score=score;
        this.age=age;
        
        
    }
    
    @Override
    public int compareTo(Student S) {
        if(score==S.score)
            return name.compareTo(S.name);
        else if(score>S.score)
            return 1;
        else
            return -1;
    }
    
    @Override
    public String toString() {
        return "\nName: "+name+" Score: "+score+" Age: "+age;
    }
}

public class Question5 {
    
    public static void main(String[] args) {
        
        Student S1,S2,S3;
        S1=new Student("Chandan",55,21);
        S2=new Student("Aditya",45,26);
        S3=new Student("Anil",65,21);
        
        List<Student> list=new ArrayList<>();
        
        list.add(S1);
        list.add(S2);
        list.add(S3);
        
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);
        
    }
    
}

