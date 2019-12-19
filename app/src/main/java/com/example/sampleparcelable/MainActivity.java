package com.example.sampleparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final int REQUEST_CODE_NUM = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                //SimpleData data = new SimpleData(100, "Hello Android!");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                ArrayList<SimpleData> datas = new ArrayList<SimpleData> ();
                datas.add(new SimpleData(111, "33"));
                datas.add(new SimpleData(222, "44"));

                //datas.notify();


                intent.putParcelableArrayListExtra("datas",datas);
                startActivityForResult(intent, 101);


            }
        });
    }

}
