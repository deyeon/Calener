package com.deyeon209.calener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.DateTimeException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText txtYear;

    Button btnAge;

    TextView txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtYear =  findViewById(R.id.txtYear);
        btnAge = findViewById(R.id.btnAge);
        txtAge = findViewById(R.id.txtAge);

        btnAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1.유저가 입력한 고양이 생년을 가져온다.

                String strYear = txtYear.getText().toString().trim();


                if(strYear.isEmpty()){
                    Toast.makeText(getApplicationContext(),"필수 데이터를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                int Year = Integer.valueOf(strYear).intValue();
                // 2. 현재 무슨년인지 현재 년도를 가져온다.
                int now =Calendar.getInstance().get(Calendar.YEAR);
                // 3. 나이 계산!
                int result = now-Year;

                txtAge.setText(result+"살입니다.");


            }
        });








    }
}