package devandroid.devdenwin.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import devandroid.devdenwin.applistacurso.R;
import devandroid.devdenwin.applistacurso.model.Pessoa;
import devandroid.devdenwin.applistacurso.model.Pet;

public class MainActivity extends AppCompatActivity {

    //declarado o objeto pessoa da classe Pessoa(importado).
    Pessoa pessoa;
    Pessoa outraPessoa;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomeCurso;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    Pet pet;

    /*
    String dadosPessoa;
    String dadosOutraPessoa;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Criado/instaciado o objeto Pessoa.
        pessoa = new Pessoa();
        outraPessoa = new Pessoa();
        pet = new Pet();

        /*
        Atribuir contéudo, dados valores para o Objeto
        conforme o seu MODELO, TEMPATE
        */

        pessoa.setPrimeiroNome("Denilson");
        pessoa.setSobreNome("Bispo dos Santos");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("(11) 9999.9999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Cássio");
        outraPessoa.setSobreNome("Ramos");
        outraPessoa.setCursoDesejado("Sociologia");
        outraPessoa.setTelefoneContato("(11) 91910-2011");

        pet.setNomePet("Billy");
        pet.setNomeTutor("Ana Karina");
        pet.setIdadePet(14);
        pet.setCidadeTutor("Caucaia");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobrenome.setText(outraPessoa.getSobreNome());
        editNomeCurso.setText(outraPessoa.getCursoDesejado());
        editTelefoneContato.setText(outraPessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");
            }
        });

        /*
        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " | Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " | Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " | Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " | Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " | Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " | Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();
        */

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: " + outraPessoa.toString());
        Log.i("POOAndroid","Objeto pet: " + pet.toString());


    }


}