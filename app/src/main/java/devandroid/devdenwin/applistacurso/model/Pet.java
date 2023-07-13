package devandroid.devdenwin.applistacurso.model;

import androidx.annotation.NonNull;

public class Pet {
    private String nomePet;
    private String nomeTutor;
    private Integer idadePet;
    private String cidadeTutor;

    public Pet() {

    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    public Integer getIdadePet() {
        return idadePet;
    }

    public void setIdadePet(Integer idadePet) {
        this.idadePet = idadePet;
    }

    public String getCidadeTutor() {
        return cidadeTutor;
    }

    public void setCidadeTutor(String cidadeTutor) {
        this.cidadeTutor = cidadeTutor;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nomePet='" + nomePet + '\'' +
                ", nomeTutor='" + nomeTutor + '\'' +
                ", idadePet=" + idadePet +
                ", cidadeTutor='" + cidadeTutor + '\'' +
                '}';
    }
}