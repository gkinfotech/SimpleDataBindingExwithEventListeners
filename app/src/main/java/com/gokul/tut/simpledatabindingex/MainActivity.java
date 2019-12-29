package com.gokul.tut.simpledatabindingex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.gokul.tut.simpledatabindingex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.setStudent(getCurrentStudent());

    }

    private Student getCurrentStudent(){
        Student student = new Student();
        student.setName("Gokul");
        student.setEmail("Gokul.krish55@gmail.com");
        return student;
    }
}
