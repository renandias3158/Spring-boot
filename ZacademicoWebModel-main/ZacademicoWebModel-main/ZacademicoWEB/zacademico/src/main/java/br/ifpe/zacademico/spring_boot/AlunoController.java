package br.ifpe.zacademico.spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import br.ifpe.zacademico.model.Aluno;
import br.ifpe.zacademico.model.AlunoDAO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class AlunoController {
    private final AlunoDAO alunoDAO;

    public AlunoController(AlunoDAO alunoDAO) {
        this.alunoDAO = alunoDAO;
    }

    @GetMapping("/aluno")
    public String getAlunoForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "aluno";
    }
    @PostMapping("/cadaluno")
    public String cadastraAluno(Aluno aluno, Model model) {
        alunoDAO.create(aluno);
        return "resultado";
    }
    
}
