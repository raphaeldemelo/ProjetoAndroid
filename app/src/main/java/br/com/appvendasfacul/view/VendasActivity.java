package br.com.appvendasfacul.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import br.com.appvendasfacul.R;
import static android.view.View.INVISIBLE;

public class VendasActivity extends AppCompatActivity {

    private List<String> itens = new ArrayList<String>();
    private ArrayAdapter<String> adaptador;
    private EditText campoEan;
    private EditText campoQtd;
    private Button btnSalvar;
    private ListView lstvwItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendas);

        BotaoAbrirCupom();
        BotaoSalvar();
        ListviewItens();

        campoEan = findViewById(R.id.campoEan);
        campoQtd = findViewById(R.id.campoQtd);
        campoQtd.setEnabled(false);
        campoEan.setEnabled(false);
    }

    public void BotaoAbrirCupom(){
        final Button btnAbrirCupom = findViewById(R.id.abrirCupomId);
        btnAbrirCupom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (btnAbrirCupom.getText() == "ABRIR CUPOM") {
                    lstvwItens.setVisibility(View.VISIBLE);
                    btnAbrirCupom.setText("FECHAR CUPOM");
                    campoQtd.setEnabled(true);
                    campoEan.setEnabled(true);

                } else {
                    lstvwItens.setVisibility(INVISIBLE);
                    btnAbrirCupom.setText("ABRIR CUPOM");
                    campoQtd.setEnabled(false);
                    campoEan.setEnabled(false);
                }
            }
        });
    }

    public void BotaoSalvar(){
        btnSalvar = findViewById(R.id.adicionarItemId);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!campoEan.getText().toString().isEmpty() && (!campoQtd.getText().toString().isEmpty())) {
                    itens.add(campoEan.getText().toString());
                    adaptador.notifyDataSetChanged();
                    campoEan.setText("");
                    campoQtd.setText("");
                    Toast.makeText(VendasActivity.this, "adicionado!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(VendasActivity.this, "não adicionou! por favor, preencha os campos!", Toast.LENGTH_SHORT).show();
                }
                if (!campoQtd.isEnabled() && (!campoEan.isEnabled())) {
                    Toast.makeText(VendasActivity.this, "Abra o cupom para adicionar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void ListviewItens(){
        lstvwItens = findViewById(R.id.lstvwItem);
        lstvwItens.setVisibility(INVISIBLE);
        adaptador = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itens);
        lstvwItens.setAdapter(adaptador);
        lstvwItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
