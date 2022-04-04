package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.mytest1.component.DaggerMyComponent;
import com.example.mytest1.module.StudentModule;
import com.example.mytest1.obj.Student;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "AAAAAAAAAAAA";

    @Inject
    Student student1;

    @Inject
    Student student2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 方式1
//        DaggerMyComponent.create().injectMainActivity(this);

        // 方式2
//        DaggerMyComponent.builder()
//                .studentModule(new StudentModule())
//                .build().injectMainActivity(this);

        // 方式3
        ((MyApplication)getApplication()).getAppComponent().injectMainActivity(this);

        Log.d(TAG, "onCreate: " + student1.hashCode());
        Log.d(TAG, "onCreate: " + student2.hashCode());

        findViewById(R.id.test_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}