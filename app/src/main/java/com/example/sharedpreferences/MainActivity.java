package com.example.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nameET;
    private EditText passET;
    private TextView nameTV;
    private TextView passTV;

    private SharedPrefarnceHandler sharedPrefarnceHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET=findViewById(R.id.ETname);
        passET=findViewById(R.id.ETpassword);
        nameTV=findViewById(R.id.TV_name);
        passTV=findViewById(R.id.TV_pass);

        sharedPrefarnceHandler=new SharedPrefarnceHandler(this);

    }

    public void save(View view) {
        sharedPrefarnceHandler.saveInfo(nameET.getText().toString(),passET.getText().toString());

        nameTV.setText(sharedPrefarnceHandler.getName());
        passTV.setText(sharedPrefarnceHandler.getPass());
    }

    public void clear(View view) {
        sharedPrefarnceHandler.clearInfo();

        nameTV.setText(sharedPrefarnceHandler.getName());
        passTV.setText(sharedPrefarnceHandler.getPass());
    }

    public void retrive(View view) {
        nameTV.setText(sharedPrefarnceHandler.getName());
        passTV.setText(sharedPrefarnceHandler.getPass());
    }
}
