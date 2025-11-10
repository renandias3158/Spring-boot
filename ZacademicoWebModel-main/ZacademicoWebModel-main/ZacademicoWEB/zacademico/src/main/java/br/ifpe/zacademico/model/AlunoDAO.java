package br.ifpe.zacademico.model;

import org.springframework.jdbc.core.simple.JdbcClient;

public class AlunoDAO {
    
    private final JdbcClient jdbcClient;

    public AlunoDAO(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }


    public Integer create(Aluno aluno){
        return jdbcClient.sql("insert into aluno(nome,cpf,idade,email_pessoal,email_institucional,senha,matricula) values(:nome,:cpf,:idade,:email_pessoal,:email_institucional,:senha,:matricula)").param("nome", aluno.getNome()).param("cpf", aluno.getCpf()).param("idade", aluno.getIdade()).param("email_pessoal", aluno.getEmailPessoal()).param("email_institucional", aluno.getEmailInstitucional()).param("senha", aluno.getSenha()).param("matricula", aluno.getMatricula()).update();
    }
}
