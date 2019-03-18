package com.ttn.sling.project.core.service;

import java.util.List;

public interface ClassConfig {

    boolean isClassLimitReached(List<Student> list,ClassConfigService classConfigService);

    int getPassingMarks(ClassConfigService classConfigService);

}
