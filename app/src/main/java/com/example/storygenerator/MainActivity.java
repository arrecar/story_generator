package com.example.storygenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText gender;
    EditText color;
    EditText location;
    EditText number;
    EditText like_one;
    EditText like_two;
    EditText like_three;
    EditText dislike_one;
    EditText dislike_two;
    EditText dislike_three;
    Button clear_btn;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        gender=findViewById(R.id.gender);
        color=findViewById(R.id.color);
        location=findViewById(R.id.location);
        number=findViewById(R.id.number);
        like_one=findViewById(R.id.like_one);
        like_two=findViewById(R.id.like_two);
        like_three=findViewById(R.id.like_three);
        dislike_one=findViewById(R.id.dislike_one);
        dislike_two=findViewById(R.id.dislike_two);
        dislike_three=findViewById(R.id.dislike_three);
        clear_btn=findViewById(R.id.clear_btn);
        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.getText().clear();
                gender.getText().clear();
                color.getText().clear();
                location.getText().clear();
                number.getText().clear();
                like_one.getText().clear();
                like_two.getText().clear();
                like_three.getText().clear();
                dislike_one.getText().clear();
                dislike_two.getText().clear();
                dislike_three.getText().clear();
            }
        });
    }
}