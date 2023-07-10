package devandroid.devdenwin.applistacurso.model;

// Classe
public class Pessoa {

    //Construtor público do Objeto

    //Atributos, estão privados e precisa de métodos de acesso para acessa-los.
    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    public Pessoa(){

    }
    //Criar método de acesso aos privates do atributos na Main Activity > Botão direito > Genarate > Getter and Setter

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {

        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
