package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
//        Log.d(TAG, "onCreate: data = " + data);
        Log.d(TAG, "onCreate: " + this + ", task id: " + getTaskId());

        Button button02 = findViewById(R.id.button_2);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.putExtra("data_return", "Hello, FirstActivity");
//                setResult(RESULT_OK, intent);
//                finish();
//                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
//                startActivity(intent);
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello, FirstActivity");
        setResult(RESULT_OK, intent);
        finish();
    }
}