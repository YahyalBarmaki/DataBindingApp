package com.example.databindingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MyClickHandler myClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p1 = new Person("Yahya","yaya@gmail.com");

        activityMainBinding = DataBindingUtil.setContentView(
                this,R.layout.activity_main
        );
        activityMainBinding.setPerson(p1);

        myClickHandler = new MyClickHandler(this);

        activityMainBinding.setClickHandler(myClickHandler);
    }
}