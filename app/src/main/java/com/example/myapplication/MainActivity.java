package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //объявляем переменные для компонент (виджетов)
    private static final String TAG = "MyApp";

    TextView txt;
    EditText edtP, edtL;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // инициализируем переменные объектами связанными с ID виджетов
        txt = (TextView)findViewById(R.id.textRes);
        edtP = (EditText)findViewById(R.id.pass);
        edtL = (EditText)findViewById(R.id.login);
        bt1 = (Button)findViewById(R.id.bt1);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (v.getId() == R.id.bt1){
                    Log.i(TAG, edtP.getText().toString());
                    if (edtL.getText().toString().equals(getApplicationContext().getString(R.string.loginP))) {
                            if (edtP.getText().toString().equals(getApplicationContext().getString(R.string.passP))) {
                                txt.setText("Вы зашли в ак");
                                txt.setTextColor(getResources().getColor(R.color.resV));
                            } else {
                                txt.setText("Не тот пароль");
                                txt.setTextColor(getResources().getColor(R.color.resF));
                            }
                    }else {
                        txt.setText("Не тот пользователь");
                    }

                }


            }
        };
        bt1.setOnClickListener(listener);
    }
}

