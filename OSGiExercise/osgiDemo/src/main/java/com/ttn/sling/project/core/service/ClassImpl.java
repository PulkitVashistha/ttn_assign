package com.ttn.sling.project.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Component(immediate = true,service = ClassConfig.class)
@Designate(ocd= ClassConfigService.class)
public class ClassImpl implements ClassConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    int MAX_STUDENT;
    int PASS_MARKS;

    @Override
    public boolean isClassLimitReached(List<Student> list) {

        int list_size=list.size();

        if(list_size<=MAX_STUDENT) {
            return true;
        }

        return true;
    }

    @Override
    public int getPassingMarks(ClassConfigService classConfigService) {
        return PASS_MARKS;
    }

    @Activate
    public void activateMethod(ClassConfigService classConfigService) {
        logger.info("\n\nClass Configuration Service Activated.\n");

        MAX_STUDENT=classConfigService.getMaxStudent();
        PASS_MARKS=classConfigService.getPassMarks();

        List<Student> list=new ArrayList<>();

        list.add(new Student(1,"Shubham",85,24));
        list.add(new Student(2,"Vivek",95,22));
        list.add(new Student(3,"Satyam",35,25));
        list.add(new Student(4,"Prakash",40,23));

        boolean classLimitReached=isClassLimitReached(list);
        int passingMarks=getPassingMarks(classConfigService);


        logger.info("\n\nClass Implementation: isClassLimitReached:: "+classLimitReached+" getPassingMarks:: "+passingMarks+"\n\n");
    }


}
