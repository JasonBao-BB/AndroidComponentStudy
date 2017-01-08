package com.example.administrator.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class SingleChecked extends Activity {

    RadioButton radioButton;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_checked);

        radioButton = (RadioButton) findViewById(R.id.answerA);
        submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton.isChecked()) {
                    Toast.makeText(getApplicationContext(),"You Got Correct",Toast.LENGTH_SHORT).show();
                    System.out.println("Correct");
                } else {
                    Toast.makeText(getApplicationContext(),"You Got Wrong",Toast.LENGTH_SHORT).show();
                    System.out.println("Wrong");
                }
            }
        });
    }
}
