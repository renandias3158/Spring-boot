package br.ifpe.zacademico.model;
public class Usuario {
    private String nome;
    private String emailPessoal;
    private int idade;
    private String cpf;
    private String senha;
    private String emailInstitucional;
    
    public Usuario(String nome, String emailPessoal, int idade, String cpf) {
        this.nome = nome;
        this.emailPessoal = emailPessoal;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailPessoal() {
        return this.emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmailInstitucional() {
        return this.emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }
    
    public void imprimeInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email Pessoal: " + emailPessoal);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);       
    }
}

