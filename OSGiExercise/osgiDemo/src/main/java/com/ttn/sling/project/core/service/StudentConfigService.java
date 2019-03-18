package com.ttn.sling.project.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Student Config Service", description = "Student Configuration Service")
public @interface StudentConfigService {

    String configValue() default "idx";



}
