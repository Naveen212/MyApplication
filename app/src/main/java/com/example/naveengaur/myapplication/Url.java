package com.example.naveengaur.myapplication;

import android.content.Intent;

/**
 * Created by naveengaur on 8/4/18.
 */

public class Url implements Runnable {
    //protected static ProjectA A;
    @Override
    public void run()
    {

     MainActivity.A=new ProjectA(MainActivity.compName.getText().toString());

     //MainActivity.handler.postDelayed(this,0);
        DashBoard.update();





    }


}
