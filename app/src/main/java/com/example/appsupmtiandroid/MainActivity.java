package com.example.appsupmtiandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import  android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button  b1,b2,b3,b4;



EditText var1,var2;
 TextView resultats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
      var1=findViewById(R.id.TextInput1);
      var2=findViewById(R.id.TextInput2);
        b1=findViewById(R.id.buttonplus);
        b2=findViewById(R.id.buttonmoins);
        b3=findViewById(R.id.buttonmultiple);
        b4=findViewById(R.id.buttonsous);
  resultats=findViewById(R.id.textView4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nb1 = Integer.parseInt(var1.getText().toString());
                int nb2 = Integer.parseInt(var2.getText().toString());
                int res = nb1 + nb2;
                resultats.setText(String.valueOf(res));
            }
});




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nb1 = Integer.parseInt(var1.getText().toString());
                int nb2 = Integer.parseInt(var2.getText().toString());
                int res = nb1 - nb2;
                resultats.setText(String.valueOf(res));
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nb1 = Integer.parseInt(var1.getText().toString());
                int nb2 = Integer.parseInt(var2.getText().toString());
                int res = nb1 * nb2;
                resultats.setText(String.valueOf(res));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nb1 = Integer.parseInt(var1.getText().toString());
                int nb2 = Integer.parseInt(var2.getText().toString());
                int res = nb1 / nb2;
                resultats.setText(String.valueOf(res));
            }
        });




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.v), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });






    }
}