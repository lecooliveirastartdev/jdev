package EstudandoPoo.ProjetoAluno.Test;

import EstudandoPoo.ProjetoAluno.Base.Aluno;
import EstudandoPoo.ProjetoAluno.Base.Diretor;
import EstudandoPoo.ProjetoAluno.Base.Pessoa;
import EstudandoPoo.ProjetoAluno.Base.Secretario;

public class ClasssesFilhasTest  {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Leco Oliveira");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("46746546464");
        diretor.setNome("Robson");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNome("Marcos");
        diretor.setIdade(40);

        System.out.println(aluno);
        System.out.println("---------------------------------------------");

        System.out.println(diretor);
        System.out.println("---------------------------------------------");

        System.out.println(secretario);
        System.out.println("---------------------------------------------");

        System.out.println(aluno.pessoaMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

        System.out.println("----------------------------");

        System.out.println("Seu salário mensal e: " + aluno.salario());
        System.out.println("Seu salário mensal e: " + diretor.salario());
        System.out.println("Seu salário mensal e: " + secretario.salario());

       

    }


}
