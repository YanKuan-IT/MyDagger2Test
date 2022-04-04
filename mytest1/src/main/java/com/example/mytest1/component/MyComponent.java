package com.example.mytest1.component;

import com.example.mytest1.MainActivity;
import com.example.mytest1.MainActivity2;
import com.example.mytest1.module.StudentModule;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {StudentModule.class})
public interface MyComponent {
    void injectMainActivity(MainActivity mainActivity);
    void injectMainActivity2(MainActivity2 mainActivity2);
}
