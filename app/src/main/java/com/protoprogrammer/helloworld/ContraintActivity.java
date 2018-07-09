package com.protoprogrammer.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContraintActivity extends AppCompatActivity {

    private Button btnSend;
    private EditText edtInput;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        btnSend = findViewById(R.id.btnSend);
        edtInput = findViewById(R.id.edtInput);
        tvOutput = findViewById(R.id.tvOutput);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOutput.setText(tvOutput.getText()+""+edtInput.getText());
                //tvOutput.setText ("Welcome "+ edtInput.getText());

            }
        });
    }
    
}
