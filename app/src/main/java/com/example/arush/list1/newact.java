package com.example.arush.list1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by arush on 09-11-2016.
 */

public class newact extends AppCompatActivity
{
    private Button save;
    private EditText title1, details1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insertdata);
        save = (Button) findViewById(R.id.button);
        title1= (EditText) findViewById(R.id.editText7);
        details1= (EditText) findViewById(R.id.editText6);
       // final Button retrievebtn= (Button) findViewById(R.id.retrieveBtn);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                save(title1.getText().toString(),details1.getText().toString());
            }
        });


    }

    private void save(String title,String details)
    {
        DBAdapter db=new DBAdapter(this);
        db.openDB();
        long result=db.add(title,details);
        if(result>0)
        {
            title1.setText("");
            details1.setText("");
            Toast.makeText(this, "Data inserted", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this, "Data not inserted", Toast.LENGTH_SHORT).show();
        }
        db.closeDB();

    }

}

