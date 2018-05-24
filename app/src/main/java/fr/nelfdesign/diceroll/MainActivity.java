package fr.nelfdesign.diceroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn4, btn6,btn20,btn8, btn10, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn4 = findViewById(R.id.btn4);
        btn6 = findViewById(R.id.btn_6);
        btn8 = findViewById(R.id.btn_8);
        btn10 = findViewById(R.id.btn10);
        btn12 = findViewById(R.id.btn12);
        btn20 = findViewById(R.id.btn_20);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page(4);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page(6);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page(8);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page(10);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page(12);
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page(20);
            }
        });
    }

    //methode créant l'intent
    private void page(int nombre){
        Intent intent = new Intent(getApplicationContext(), LancerActivity.class);
        intent.putExtra("max", nombre);
        startActivity(intent);
    }
}
