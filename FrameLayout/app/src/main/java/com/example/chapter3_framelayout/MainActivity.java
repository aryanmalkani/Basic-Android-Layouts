package com.example.chapter3_framelayout;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login1(View view){
        EditText edt1,edt2;
        Button btn;

        edt1 = findViewById(R.id.ed1);
        edt2 = findViewById(R.id.ed2);
        btn = findViewById(R.id.btn1);

        if(edt1.getText().toString().equals("Aryan")&edt2.getText().toString().equals("admin123")){
            Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_LONG).show();
        }
    }
}