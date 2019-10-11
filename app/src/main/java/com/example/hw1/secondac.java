package com.example.hw1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.graphics.Color;
import android.widget.Toast;


public class secondac extends MainActivity {
    Button back;
    Button check;
    Button save;
    EditText etid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("회원 가입 구성");


        back = (Button) findViewById(R.id.buttonback);
        check = (Button) findViewById(R.id.buttoncheck);
        save = (Button) findViewById(R.id.buttonsave);
        etid = (EditText)findViewById(R.id.editText3);
        id = etid.getText().toString();


        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etid.getText().toString().length() == 0){
                    Toast.makeText(secondac.this, "id를 입력하세요.",Toast.LENGTH_SHORT).show();
                    etid.requestFocus();
                    return;
                }
                Intent result = new Intent();
                result.putExtra("id", etid.getText().toString());
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }
}
