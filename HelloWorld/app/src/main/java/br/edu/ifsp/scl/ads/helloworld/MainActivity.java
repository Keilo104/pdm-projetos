package br.edu.ifsp.scl.ads.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int contador = 0;
    private Button cliqueBt;
    private Spinner inicialSp;
    private TextView contadorTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicialSp = findViewById(R.id.inicialSp);
        contadorTv = findViewById(R.id.contadorTv);

        cliqueBt = findViewById(R.id.cliqueBt);
        cliqueBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                int valorAtual = Integer.parseInt(
                        ((TextView) inicialSp.getSelectedView())
                                .getText()
                                .toString()
                );

                contadorTv.setText(Integer.toString(contador + valorAtual));
            }
        });
    }
}