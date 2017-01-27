package com.antonionicolaspina.animatedvectordrawables;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    DataBindingUtil.setContentView(this, R.layout.activity_main);
  }
}
