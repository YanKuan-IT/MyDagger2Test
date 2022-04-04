package com.example.mytest1.module;

import com.example.mytest1.obj.Student;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {
    @Singleton
    @Provides
    public Student providerStudentObject() {
        return new Student();
    }
}
