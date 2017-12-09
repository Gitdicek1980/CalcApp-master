package jp.techacademy.yamamoto.daisuke.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        intent.getIntExtra("button1", 0);
        intent.getIntExtra("button2", 0);
        intent.getIntExtra("button3", 0);
        intent.getIntExtra("button4", 0);

        TextView textView = (TextView) findViewById(R.id.textView);
        double result = getIntent().getDoubleExtra("result", 0.0);
        textView.setText(Double.toString(result));

    }
}
