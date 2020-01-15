package com.ppsi.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et1 = (EditText)findViewById(R.id.etName);
        final EditText et2 = (EditText)findViewById(R.id.etPassword);
        Button b1 = (Button)findViewById(R.id.btnLogin);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(et1.getText().length()==0)
                {
                    et1.setError("Please Enter Name");
                }
                else if (et2.getText().length()==0)
                {
                    et2.setError("Please Enter Password");
                }
                else if(et1.getText().toString().equals("admin") && et2.getText().toString().equals("admin") )
                {
                    Intent i = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong UserName or Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
