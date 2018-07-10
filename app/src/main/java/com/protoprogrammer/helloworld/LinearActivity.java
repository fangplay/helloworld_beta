package com.protoprogrammer.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class LinearActivity extends AppCompatActivity {

    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        tvOutput = findViewById(R.id.tvOutput);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.mnuNew:
                Toast.makeText(this, "New!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnuHelp:
                Toast.makeText(this, "Help!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_meat:
                if (checked) {
                    System.out.println("Put some meat on the sandwich");
                    tvOutput.setText("Meat");
                }
                else
                    System.out.println("Remove the meat");
                break;
            case R.id.checkbox_cheese:
                if (checked) {
                    System.out.println("Cheese me");
                    tvOutput.setText("Cheese");
                }
                else
                    System.out.println("I'm lactose intolerant");
                break;
        }
    }

    public void onRadioButtonClicked(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    tvOutput.setText("Pirates are the best");
                break;
            case R.id.radio_ninjas:
                if (checked)
                    tvOutput.setText("Ninjas rule ");
                break;
        }

    }
}
