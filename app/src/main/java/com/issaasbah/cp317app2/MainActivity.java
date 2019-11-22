package com.issaasbah.cp317app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button SignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignUpBtn = findViewById(R.id.button2);

    }

    public void moveToSignUp(View view) {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}
