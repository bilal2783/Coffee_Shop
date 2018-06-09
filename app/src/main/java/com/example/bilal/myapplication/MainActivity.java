package com.example.bilal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity

{
    TextView tv;
    EditText et;
    RadioGroup rg;
    Button btn;
    int price;
    int t[]={0,100,200,300};
    int q[]={0,0,0,0,0,100};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.name);
        btn=findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                rg=findViewById(R.id.type_of_coffee);
                int type=rg.getCheckedRadioButtonId();
                rg=findViewById(R.id.quantity);
                et=findViewById(R.id.name);
                int qty=rg.getCheckedRadioButtonId();
                    price=t[type]+q[qty];
                    tv=findViewById(R.id.display);
                    tv.setText("Hello! "+et.getText()+"\nPrice of your Coffee is "+price);

            }
        });


    }
}
