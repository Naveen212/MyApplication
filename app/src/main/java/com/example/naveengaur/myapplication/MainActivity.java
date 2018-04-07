package com.example.naveengaur.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    protected static EditText  compName;
    private Button submit;
    protected static Handler handler;
    protected static ProjectA A;
    protected static Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compName=(EditText) findViewById(R.id.CompanyName);
        submit=(Button)findViewById(R.id.button);

        /* overrides the exception for network on main thread
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
*/
        /*
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //handler=new Handler();

                Url u=new Url();
                new Thread(u).start();
                //handler.postDelayed(u,0);
                Intent intent=new Intent(MainActivity.this,DashBoard.class);
                startActivity(intent);

                //DashBoard.mTextView.append(MainActivity.compName.getText().toString());






            }




        });
        */


            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    update();
                }
            });


    }
    protected  void update()
    {
        Thread  thread=new Thread(new Runnable() {
            @Override
            public void run() {
                A=new ProjectA(compName.getText().toString());
                Intent intent=new Intent(MainActivity.this,DashBoard.class);
                startActivity(intent);



            }
        });
        thread.start();
    }



    // assign the compName to the Edit text in XML

}
