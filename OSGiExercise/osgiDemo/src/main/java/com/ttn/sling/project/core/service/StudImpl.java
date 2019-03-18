package com.ttn.sling.project.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Component(immediate = true,service = StudentConfig.class)
@Designate(ocd= StudentConfigService.class)
public class StudImpl implements StudentConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //ClassConfigService classConfigService; //Accessing Class Service

    ClassImpl classImpl=new ClassImpl();    //Accessing Members of Service Implemenation
    List<Student> globalStudentList=new ArrayList<>();

    @Override
    public String addStudent(Student student) {

            boolean result = classImpl.isClassLimitReached(globalStudentList);


            if (result) {
                globalStudentList.add(student);

                return "Added: "+student;
            }

            return "Student cannot be added limit reached.";
    }

    @Override
    public boolean deleteStudent(int id) {

        if (globalStudentList.size()>0) {
            globalStudentList.remove(globalStudentList.size()-1);
            return true;
        }
        return false;
    }

    @Override
    public boolean isStudentPassed(int id) {

        for(Student student:globalStudentList) {
            if(student.id==id) {
                if(student.marks>=classImpl.PASS_MARKS) {
                    return true;
                }
            }
        }

        return false;
    }

    public Student getStudent(int id) {

        for(Student student:globalStudentList) {
            if(student.id==id) {
                return student;
            }
        }

        return new Student();
    }

    public List<Student> getAllStudents() {
        if(globalStudentList.size()>0) {
            return globalStudentList;
        }
        return new ArrayList<>();
    }

    @Activate
    public void activateMethod(StudentConfigService studentConfigService) {
        logger.info("\n\nStudent Configuration Service Activated.\n");


        Student student1,student2,student3,student4;
        student1=new Student(1,"Shubham",85,24);
        student2=new Student(2,"Vivek",95,22);
        student3=new Student(3,"Satyam",30,25);
        student4=new Student(4,"Prakash",20,23);





        logger.info("\n\nStudent Implementation:\n" +
                "Adding Student 1: " +addStudent(student1)+
                "\nAdding Student 2: " +addStudent(student2)+
                "\nAdding Student 3: " +addStudent(student3)+
                "\nAdding Student 4: "+addStudent(student4)+
                "\nDeleting Last Student: " +deleteStudent(2)+
                "\nIs Student 3 Pass:" +isStudentPassed(4)+
                "\nGetting Student 1: " +getStudent(1)+
                "\nGetting All Students: " +getAllStudents()+
                "\n");
    }


}
