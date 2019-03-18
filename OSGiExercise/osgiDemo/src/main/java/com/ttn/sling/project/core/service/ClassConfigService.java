package com.ttn.sling.project.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "Student Config Service", description = "Student Configuration Service")
public @interface ClassConfigService {

    String configValue() default "idx";

    @AttributeDefinition(name = "MaximumStudent", description = "Maximum Allowed Students", type = AttributeType.INTEGER)
    int getMaxStudent() default 15;


    @AttributeDefinition(name = "StudentPassingMarks", description = "Student Passing Marks", type = AttributeType.INTEGER)
    int getPassMarks() default 30;



}
