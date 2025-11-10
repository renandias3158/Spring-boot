package br.ifpe.zacademico.model;

public class Aluno extends Usuario{
    
    private String matricula;
    
public Aluno(String nome, String emailPessoal, int
    idade, String cpf, String matricula){
    super(nome, emailPessoal, idade, cpf);
    
    this.matricula = matricula;
    
    }
    
public String getMatricula(){
    
return this.matricula;

}

public void setMatricula(String matricula){
    
this.matricula = matricula;

}

}
