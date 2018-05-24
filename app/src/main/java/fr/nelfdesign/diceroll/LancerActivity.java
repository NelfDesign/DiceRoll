package fr.nelfdesign.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class LancerActivity extends AppCompatActivity {

    private TextView result;
    private TextView title;
    private Button btnRoll;
    private int max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancer);

        result = findViewById(R.id.textResult);
        title = findViewById(R.id.textTitle);
        btnRoll = findViewById(R.id.buttonRoll);

        max = getIntent().getIntExtra("max", 0);

        title.setText(max + " Slided Dice");
        result.setText("");

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               result.setText(String.valueOf(random(max)));
            }
        });
    }

    //methode random
    private int random(int max){
        SecureRandom rand = new SecureRandom();
        int random = rand.nextInt(max)+ 1;
        return random;
    }
}
