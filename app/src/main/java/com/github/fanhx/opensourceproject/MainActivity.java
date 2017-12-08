package com.github.fanhx.opensourceproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.fanhx.opensourceproject.activity.AboutActivity;


/**
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textgo);
        textView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textgo:
                Intent intent = new Intent(getApplication(), AboutActivity.class);
                startActivity(intent);
                break;

        }
    }
}
