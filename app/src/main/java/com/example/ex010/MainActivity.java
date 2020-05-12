package com.example.ex010;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Switch switch1;
    ToggleButton tB;
    boolean b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btn);
        switch1= (Switch) findViewById(R.id.switch1);
        tB= (ToggleButton) findViewById(R.id.tB);
    }

    public void push(View view) {
        if (tB.isChecked())
            b1=true;
        else
            b1=false;
        if (switch1.isChecked())
            b2=true;
        else
            b2=false;
        if (b1==true&&b2==true)
            setMyScreenColor(Color.RED);
        else if (b1==true&&b2==false)
            setMyScreenColor(Color.BLACK);
        else if (b1==false&&b2==true)
            setMyScreenColor(Color.WHITE);
        else
            setMyScreenColor(Color.GRAY);
    }

    private void setMyScreenColor(int color) {
        View view= this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}
