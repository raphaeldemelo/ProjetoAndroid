package br.com.appvendasfacul.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.appvendasfacul.R;

public class VendasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendas);

        final Button btnAbrirCupom = findViewById(R.id.abrirCupomId);
        btnAbrirCupom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAbrirCupom.getText() == "ABRIR CUPOM"){
                    btnAbrirCupom.setText("FECHAR CUPOM");
                }else{
                    btnAbrirCupom.setText("ABRIR CUPOM");
                }
            }
        });
    }
}
