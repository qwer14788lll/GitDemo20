package com.example.gitdemo20;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author 龚鸿飞
 */
public class MainActivity extends AppCompatActivity {
    private static String NUMBER = "number";
    private int number = 0;
    private Button mButtonAdd, mButtonSub;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonAdd = findViewById(R.id.buttonAdd);
        mTextView = findViewById(R.id.textView);
        mButtonSub = findViewById(R.id.buttonSub);

        number = savedInstanceState != null ? savedInstanceState.getInt(NUMBER) : 0;

        //给textView赋初值
        mTextView.setText(String.valueOf(number));
        //编写buttonAdd点击事件实现+1功能
        mButtonAdd.setOnClickListener(v -> mTextView.setText(String.valueOf(++number)));
        mButtonSub.setOnClickListener(v -> mTextView.setText(String.valueOf(--number)));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(NUMBER,number);
    }
}