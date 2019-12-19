package com.example.sampleparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textView2 = (TextView) findViewById( R.id.textView2);
        Button button2 = (Button) findViewById( R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name", "mike");
                setResult(RESULT_OK, intent);

                finish();
            }
        });

        Intent intent = getIntent();
        processIntent(intent);


    }
    public void processIntent(Intent intent){
        if (intent != null){
            Bundle bundle = intent.getExtras();
            ArrayList<SimpleData> datas = new ArrayList<SimpleData>();
            datas = bundle.getParcelableArrayList("datas");
             SimpleData data0 = datas.get(0);
             SimpleData data1 = datas.get(1);
            if (intent != null){
                textView2.setText("전달받은 데이터 \nNumer : " + data0.number+"\nMessage :" + data0.message);

            }

        }
    }
}
