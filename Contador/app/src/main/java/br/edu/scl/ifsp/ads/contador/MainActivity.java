package br.edu.scl.ifsp.ads.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;

import br.edu.scl.ifsp.ads.contador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    private int contador = 0;
    private int add = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        amb = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(amb.getRoot());

        amb.inicialSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    add = 1;
                } else {
                    add = position * 5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // NSA
            }
        });

        amb.cliqueBt.setOnClickListener(
                v -> amb.contadorTv.setText(String.valueOf(contador = contador + add))
        );
    }
}