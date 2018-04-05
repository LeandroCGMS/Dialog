package dialog.leandro.com.br.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends Activity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.botaoId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Criar alert dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //Configurar o título
                dialog.setTitle("Título da dialog");

                //Configurar a mensagem
                dialog.setMessage("Mensagem da dialog");

                dialog.setCancelable(false);
                dialog.setIcon(android.R.drawable.ic_delete);

                //Botão negativo
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                makeText(MainActivity.this, "Foi pressionado o botão Não.",Toast.LENGTH_SHORT ).show();
                            }
                        });

                //Botão positivo
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                makeText(MainActivity.this,"Foi pressionado o botão Sim", Toast.LENGTH_SHORT).show();
                            }
                        });
                dialog.create();
                dialog.show();
            }
        });

    }
}
