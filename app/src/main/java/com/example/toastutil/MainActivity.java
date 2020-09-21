package com.example.toastutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void ToastUtils(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    private void ToastUtilsLong(String string){
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }
}