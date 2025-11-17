package br.ifpe.zacademico.model;

import java.util.List;
import java.util.ArrayList;

public class Escola {
    private String idMec;
    private String nome;
    private String cnpj;
    private String tipo;
    private String localidade;
    private List<Aluno> alunos;

    public Escola(String idMec, String nome, String cnpj, String tipo, String localidade) {
        this.idMec = idMec;
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipo = tipo;
        this.localidade = localidade;
        this.alunos = new ArrayList<>();
    }

    public String getIdMec() {
        return idMec;
    }

    public void setIdMec(String idMec) {
        this.idMec = idMec;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}