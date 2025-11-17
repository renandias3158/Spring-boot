package br.ifpe.zacademico.model;

import java.util.List;

public class Professor extends Usuario {
    private int siape;
    private String areaFormacao;
    private String nivelInstrucao;
    private List<GrupoPesquisas> GruposPesquisa;

    public Professor(String nome, String emailPessoal, int idade, String cpf, int siape, String areaFormacao) {
        super(nome, emailPessoal, idade, cpf);
        this.siape = siape;
        this.areaFormacao = areaFormacao;
    }

    public int getSiape() {
        return this.siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getAreaFormacao() {
        return this.areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public String getNivelInstrucao() {
        return this.nivelInstrucao;
    }

    public void setNivelInstrucao(String nivelInstrucao) {
        this.nivelInstrucao = nivelInstrucao;
    }

    public List<GrupoPesquisas> getGruposPesquisa() {
        return this.GruposPesquisa;
    }

    public void setGruposPesquisa(List<GrupoPesquisas> GruposPesquisa) {
        this.GruposPesquisa = GruposPesquisa;
    }

}
