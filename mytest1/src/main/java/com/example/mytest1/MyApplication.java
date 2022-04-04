package com.example.mytest1;

import android.app.Application;
import com.example.mytest1.component.DaggerMyComponent;
import com.example.mytest1.component.MyComponent;
import com.example.mytest1.module.StudentModule;

public class MyApplication extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder()
                .studentModule(new StudentModule())
                .build();
    }

    public MyComponent getAppComponent() {
        return myComponent;
    }
}
