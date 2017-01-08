package com.example.administrator.androidcomponent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MultipleChecked extends Activity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    Button button,btn2,btn3;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_checked);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);

        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);
        checkBox4.setOnCheckedChangeListener(this);

        textView = (TextView) findViewById(R.id.CheckResult);


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String str = "I like ";
        if (checkBox1.isChecked()) {
            str += checkBox1.getText()+ " , ";
        }
        if (checkBox2.isChecked()) {
            str += checkBox2.getText()+ " , ";
        }
        if (checkBox3.isChecked()) {
            str += checkBox3.getText()+ " , ";
        }
        if (checkBox4.isChecked()) {
            str += checkBox4.getText()+ " , ";
        }
        textView.setText(str);
    }

    @Override
    public void onClick(View v) {
        
    }
}
