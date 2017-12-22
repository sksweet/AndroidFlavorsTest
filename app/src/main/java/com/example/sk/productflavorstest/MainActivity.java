package com.example.sk.productflavorstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        editText = (EditText) findViewById(R.id.name_edit_text);
    }

    public void sayHello(View view) {
        String name = editText.getText().toString();
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("user", name);
        startActivity(intent);
    }

    public void cancel_button_label(View view) {
        String name = editText.getText().toString();
        Intent intent = new Intent(this, CancelForHelpActivity.class);
        intent.putExtra("user", name);
        startActivity(intent);
    }
}
