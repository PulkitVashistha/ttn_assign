package com.ttn.sling.project.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Component(immediate = true, service = ClassConfig.class)
@Designate(ocd= ClassConfigService.class)
public class ClassImpl implements ClassConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //@Reference
    ClassConfigService classConfigService;

    @Override
    public boolean isClassLimitReached(int list_size) {


        if(list_size<=classConfigService.getMaxStudent()) {
            return true;
        }

        return true;
    }

    @Override
    public int getPassingMarks() {
        return classConfigService.getPassMarks();
    }

    @Activate
    public void activateMethod(ClassConfigService classConfigService) {

        this.classConfigService=classConfigService;

        logger.info("\n\nClass Configuration Service Activated.\n");

        //The blow code is for testing perpose only
        List<Student> list=new ArrayList<>();

        list.add(new Student(1,"Shubham",85,24));
        list.add(new Student(2,"Vivek",95,22));
        list.add(new Student(3,"Satyam",35,25));
        list.add(new Student(4,"Prakash",40,23));

        boolean classLimitReached=isClassLimitReached(list.size());
        int passingMarks=getPassingMarks();

        logger.info("\n\nClass Implementation: isClassLimitReached:: "+classLimitReached+" getPassingMarks:: "+passingMarks+"\n\n");

    }


}
