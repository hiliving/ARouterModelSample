package com.example.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mzule.activityrouter.router.Routers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button first;
    private Button second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_activity_main);

        first = (Button) findViewById(R.id.stepfo);
        second = (Button) findViewById(R.id.stepft);
        first.setOnClickListener(this);
        second.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       if (v.getId()==R.id.stepfo){
           Routers.open(MainActivity.this, "module://modelfirst");
       }else{
           Routers.open(MainActivity.this, "module://modelsecond");
       }
    }
}
