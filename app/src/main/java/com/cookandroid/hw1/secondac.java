package com.cookandroid.hw1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;
import java.util.ArrayList;
import java.lang.String;


public class secondac extends Activity {
    Button back;
    Button check;
    Button save;
    EditText etid,etpw;
    String id,pw;
    ArrayList <String> idlist = new ArrayList<String>();
    ArrayList<String> pwlist = new ArrayList<String>();

    public void setIdlist(ArrayList<String> idlist, String s){
        this.idlist.add(s);
    }
    public void setPasswordlist(ArrayList<String> pwlist, String s){
        this.pwlist.add(s);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("회원 가입 구성");


        back = (Button) findViewById(R.id.buttonback);
        check = (Button) findViewById(R.id.buttoncheck);
        save = (Button) findViewById(R.id.buttonsave);
        etid = (EditText)findViewById(R.id.editText3);
        etpw = (EditText) findViewById(R.id.editText4);
        id = etid.getText().toString();
        pw = etpw.getText().toString();




        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setIdlist(idlist, id);
                setPasswordlist(pwlist, pw);
                Toast.makeText(secondac.this, "회원가입 완료", Toast.LENGTH_SHORT).show();
                Intent inintent = new Intent(getApplicationContext(), MainActivity.class);
                inintent.putExtra("hw2", idlist);
                inintent.putExtra("pwlist", pwlist);
                startActivity(inintent);
            }
        });
    }
}
