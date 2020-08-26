package com.example.wedding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGroom();
            }
        });

        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBride();
            }
        });
    }
    public void openGroom(){
        Intent intent2 = new Intent(this, Groom.class);
        startActivity(intent2);
    }

    public void openBride(){
        Intent intent2 = new Intent(this, Bride.class);
        startActivity(intent2);
    }
}
