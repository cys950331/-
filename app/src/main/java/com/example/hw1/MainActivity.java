package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;
import java.util.ArrayList;
import java.lang.String;


public class MainActivity extends AppCompatActivity {
    EditText ed, ed2;
    Button log, reg;
    String id;
    String pw;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초기 화면");

        Intent intent;
        intent = getIntent();
        final ArrayList<String> hw = intent.getStringArrayListExtra("hw2");
        final ArrayList<String> pl = intent.getStringArrayListExtra("pwlist");




        ed = (EditText) findViewById(R.id.edi);
        ed2 = (EditText) findViewById(R.id.edi2);
        log = (Button) findViewById(R.id.btnlog);
        reg = (Button) findViewById(R.id.btnreg);
        id = ed.getText().toString();
        pw = ed2.getText().toString();



        log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int count = 0;
                for(int i=0; i<hw.size(); i++){
                    if(id.equals(hw.get(i))){
                        int index = i;
                        if(pw.equals(pl.get(index))){
                            Intent intent = new Intent(getApplicationContext(), thirdac.class);
                            startActivity(intent);
                            break;
                        }
                        else{
                            Toast.makeText(MainActivity.this, "비밀번호 오류", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        count++;
                    }

                }

                if(count == hw.size()){
                    Toast.makeText(MainActivity.this, "회원정보 없음", Toast.LENGTH_SHORT).show();
                }
            }
        });
        reg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), secondac.class);
                startActivity(intent2);
            }
        });

    }
    }

