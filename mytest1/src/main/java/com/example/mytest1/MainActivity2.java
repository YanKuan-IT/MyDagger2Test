package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.mytest1.component.DaggerMyComponent;
import com.example.mytest1.obj.Student;
import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "AAAAAAAAAAAA";

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 方式1
//        DaggerMyComponent.create().injectMainActivity2(this);

        // 方式3
        ((MyApplication)getApplication()).getAppComponent().injectMainActivity2(this);

        Log.d(TAG, "onCreate: " + student.hashCode());
    }
}