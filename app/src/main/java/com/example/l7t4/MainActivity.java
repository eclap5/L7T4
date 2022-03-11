package com.example.l7t4;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextWatcher;
import android.text.Editable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements TextWatcher
{

    TextView text;
    EditText inputText;
    EditText inputText_OUT;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.textView);
        inputText = (EditText) findViewById(R.id.editTextTextPersonName);

        inputText_OUT = (EditText) findViewById(R.id.editTextTextPersonName);
        inputText_OUT.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after)
    {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count)
    {

    }

    @Override
    public void afterTextChanged(Editable s)
    {
        text.setText(s);
    }



}