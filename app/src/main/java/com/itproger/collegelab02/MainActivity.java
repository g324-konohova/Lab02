package com.itproger.collegelab02;

import android.graphics.text.TextRunShaper;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText TextA, TextB;
    TextView TextRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextA = findViewById(R.id.Number1);
        TextB = findViewById(R.id.Number2);
        TextRes = findViewById(R.id.viewResult);
    }
    public void add_click(View v)
    {
        String sa = TextA.getText().toString();
        String sb = TextB.getText().toString();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        int c = a + b;

        String ac = String.valueOf(c);
        TextRes.setText(ac);
    }
    public void div_click(View v) {
        String sa = TextA.getText().toString();
        String sb = TextB.getText().toString();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        int c = a - b;

        String ac = String.valueOf(c);
        TextRes.setText(ac);
    }
    public void sub_click(View v) {
        String sa = TextA.getText().toString();
        String sb = TextB.getText().toString();

            int a = Integer.parseInt(sa);
            int b = Integer.parseInt(sb);

            if (b == 0) {
                TextRes.setText("Ошибка");
            }

            else {
                int c = a / b;
                String ac = String.valueOf(c);
                TextRes.setText(ac);
            }
    }

    public void mult_click(View v) {
        String sa = TextA.getText().toString();
        String sb = TextB.getText().toString();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        int c = a * b;

        String ac = String.valueOf(c);
        TextRes.setText(ac);
    }
    public void clear_click(View v)
    {
        TextA.getText().clear();
        TextB.getText().clear();
        TextRes.setText("");
    }

}