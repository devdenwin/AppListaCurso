package devandroid.devdenwin.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.devdenwin.applistacurso.R;
import devandroid.devdenwin.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    //declarado o objeto pessoa da classe Pessoa(importado).
    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Criado/instaciado o objeto Pessoa.
        pessoa = new Pessoa();
        outraPessoa = new Pessoa();

        /*
        Atribuir contéudo, dados valores para o Objeto
        conforme o seu MODELO, TEMPATE
        */

        pessoa.setPrimeiroNome("Denilson");
        pessoa.setSobreNome("Bispo dos Santos");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-99999999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Cássio");
        outraPessoa.setSobreNome("Ramos");
        outraPessoa.setCursoDesejado("Sociologia");
        outraPessoa.setTelefoneContato("11-919102011");

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

    }

}