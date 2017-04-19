package com.practice.dev.modelfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mzule.activityrouter.annotation.Router;
import com.github.mzule.activityrouter.router.Routers;
@Router("modelfirst")
public class ModelFirstActivity extends AppCompatActivity implements View.OnClickListener {

    private Button setps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_activity_main);
        setps = (Button) findViewById(R.id.step);
        setps.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.step);{
            Routers.open(ModelFirstActivity.this, "module://modelsecond");
        }
    }
}
