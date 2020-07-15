package com.example.dice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //변수선언
    private TextView maintext;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //화면구성사용선언
        maintext = (TextView) findViewById(R.id.maintext);
        button = (Button) findViewById(R.id.button);

        //버튼 클릭시 이벤트
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //주사위 숫자 최초 0선언
                int dicenum = 0;

                //Random 함수 선언
                Random random = new Random();

                //random수 생성하여 dicenum에 입력
                //+1의 이유 0부터 6개 0~5를 가져오므로 +1을 해주어
                //1~6사이의 숫자를 가져올 수 있도록 함
                dicenum = random.nextInt(6)+1;

                //추출한 dicenum을 maintext에 출력
                maintext.setText(String.valueOf(dicenum));
            }
        });

    }
}