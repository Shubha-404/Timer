package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
//    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText timeStr=findViewById(R.id.time_in);
        Button st=findViewById(R.id.start_btn);
        TextView tv=findViewById(R.id.remain_time);

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ti=timeStr.getText().toString();
                int time=Integer.parseInt(ti);

                CountDownTimer timer=new CountDownTimer(time*60L* 1000L,1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    tv.setText(String.valueOf(millisUntilFinished));
                    ///Toast.makeText(MainActivity.this, "CountDownTimer ticking: "+millisUntilFinished/1000, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFinish() {
                    Toast.makeText(MainActivity.this, "Timer Finished", Toast.LENGTH_SHORT).show();
                }
            };
            timer.start();
            }
        });
//        Handler handler=new Handler();
//        Runnable run=new Runnable(){
//            @Override
//            public void run() {
//                n++;
//                Toast.makeText(MainActivity.this,"Testing : "+n,Toast.LENGTH_SHORT).show();
//                handler.postDelayed(this,3000);
//            }
//        };
//        handler.post(run);
//        CountDownTimer timer=new CountDownTimer(10000,1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                Toast.makeText(MainActivity.this, "CountDownTimer ticking: "+millisUntilFinished/1000, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFinish() {
//                Toast.makeText(MainActivity.this, "CountDownTimer Finished", Toast.LENGTH_SHORT).show();
//            }
//        };
//        timer.start();
    }
}