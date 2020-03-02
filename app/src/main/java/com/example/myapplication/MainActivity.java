package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         Email=(EditText)findViewById(R.id.etname);
         Password =(EditText)findViewById(R.id.passtext);
         Login=(Button)findViewById(R.id.btnlogin);
         Login.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 if(validate()) {
                     Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                     startActivity(intent);
                 }

             }
         });

    }

    public boolean validate(){
        boolean flag =false;
            String email=Email.getText().toString();
            String password=Password.getText().toString();
            if(email.isEmpty()&&password.isEmpty())
                Toast.makeText(this,"please enter email and password",Toast.LENGTH_SHORT).show();
            else
                if(password.isEmpty())
                    Toast.makeText(this,"please enter password",Toast.LENGTH_SHORT).show();
                if(email.isEmpty())
                    Toast.makeText(this,"please enter email",Toast.LENGTH_SHORT).show();
                else
                    if(!(email.isEmpty())&&!(password.isEmpty()))
                flag=true;
                return flag;

    }
}
