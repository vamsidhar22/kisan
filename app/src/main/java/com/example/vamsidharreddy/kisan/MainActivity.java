package com.example.vamsidharreddy.kisan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button signin,signup;
    TextView slogan,title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin=(Button)findViewById(R.id.signin);
        signup=(Button)findViewById(R.id.signup);
        slogan=(TextView)findViewById(R.id.textslogan);
        title=(TextView)findViewById(R.id.apptitle);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signin=new Intent(MainActivity.this, com.example.vamsidharreddy.kisan.signin.class);
                startActivity(signin);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup=new Intent(MainActivity.this, com.example.vamsidharreddy.kisan.signup.class);
                startActivity(signup);


            }
        });

    }
}
