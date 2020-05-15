package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

      public void change(View view)
      {
          ImageView dollar;
          TextView txtv = findViewById(R.id.editText3);
          String txt = txtv.getText().toString();
          Double d = Double.parseDouble(txt);
          Double d2 = d*75.56;
          Toast.makeText( this," "+d2,Toast.LENGTH_LONG).show();

      }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

