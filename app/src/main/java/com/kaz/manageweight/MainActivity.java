package com.kaz.manageweight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview = (TextView) findViewById(R.id.textview);
        textview.setText("書き換えたよ");

        setup();
    }

    protected void setup() {
        findViewById(R.id.registerButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("", "-----Clicked-----");
                EditText bwField = (EditText)findViewById(R.id.bwField);
                EditText bfField = (EditText) findViewById(R.id.bfField);
                Log.d("", String.format("BW: %s, BF: %s", bwField.getText() , bfField.getText() ));
            }
        });
    }
}
