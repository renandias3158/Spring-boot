package br.ifpe.zacademico.model;

public class tecAdm extends Usuario {
    private int siape;
    private String nivelInstrucao;

    public tecAdm(String nome, String emailPessoal, int idade, String cpf, int siape, String nivelInstrucao) {
        super(nome, emailPessoal, idade, cpf);
        this.siape = siape;
        this.nivelInstrucao = nivelInstrucao;
    }

    public int getSiape() {
        return this.siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getNivelInstrucao() {
        return this.nivelInstrucao;
    }

    public void setNivelInstrucao(String nivelInstrucao) {
        this.nivelInstrucao = nivelInstrucao;
    }
    
    @Override
    public void imprimeInfo() {
        super.imprimeInfo(); 
        System.out.println("SIAPE: " + siape);
        System.out.println("Nível de Instrução: " + nivelInstrucao);
    }
}