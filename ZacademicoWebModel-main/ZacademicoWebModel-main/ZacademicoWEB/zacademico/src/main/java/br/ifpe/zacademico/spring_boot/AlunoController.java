package br.ifpe.zacademico.spring_boot;

import org.springframework.stereotype.Controller;

import br.ifpe.zacademico.model.AlunoDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class AlunoController {
    private final AlunoDAO alunoDAO;

    public AlunoController(AlunoDAO alunoDAO){
        this.alunoDAO = alunoDAO;
    }
    @GetMapping("/aluno")
    public String getAlunoForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        return Aluno();
    }
    
}
