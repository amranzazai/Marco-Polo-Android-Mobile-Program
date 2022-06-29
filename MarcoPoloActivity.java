package com.example.marcopoloassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MarcoPoloActivity extends AppCompatActivity {
    private Button mMarcoButton, mPoloButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcopolo);

        mMarcoButton = (Button)findViewById(R.id.marco_button);
        mPoloButton = (Button)findViewById(R.id.polo_button);

        mMarcoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Code to execute on button click
                Toast.makeText( MarcoPoloActivity.this,
                        R.string.marco_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });


        mPoloButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Code to execute on button click
                Toast.makeText( MarcoPoloActivity.this,
                R.string.polo_toast,
                Toast.LENGTH_SHORT).show();
            }
        });
    }
}