package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    EditText ed, ed2;
    Button log, reg;
    String[] db = new String[5];
    String id;
    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초기 화면");

        ed = (EditText) findViewById(R.id.edi);
        ed2 = (EditText) findViewById(R.id.edi2);
        log = (Button) findViewById(R.id.btnlog);
        reg = (Button) findViewById(R.id.btnreg);


        log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), thirdac.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivityForResult(intent, 1000);
            }
        });
        reg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), secondac.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("RESULT",requestCode+"");
        Log.d("RESULT", resultCode +"");
        Log.d("RESULT", data + "");

        if(requestCode == 1000 && resultCode == RESULT_OK){
            Toast.makeText(MainActivity.this,"회원가입을 완료했습니다.", Toast.LENGTH_SHORT).show();
            ed.setText(data.getStringExtra("id"));
        }
    }
    }

