package com.example.camopener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg extends AppCompatActivity {

    EditText name;
    EditText loc;
    Button save;
    String s,nme,lo;
    DbHlpr dbHlpr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        name=findViewById(R.id.editTextTextPersonName);
        loc=findViewById(R.id.editTextTextPersonName2);
        save=findViewById(R.id.button2);
        dbHlpr = new DbHlpr(Reg.this);


    }

    public void save(View view) {
        nme=name.getText().toString();
        lo=loc.getText().toString();
        s = nme+"\n"+lo;

        Intent obj = new Intent(Reg.this,Display.class);
        obj.putExtra("xys",s);
        startActivity(obj);

        Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
        dbHlpr.savdetals(nme,lo);

    }
}