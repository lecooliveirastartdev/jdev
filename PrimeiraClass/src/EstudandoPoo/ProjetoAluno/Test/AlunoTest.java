package EstudandoPoo.ProjetoAluno.Test;

import EstudandoPoo.ProjetoAluno.Base.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno();

        aluno.setNome("Leco Oliveira");
        aluno.setIdade(10);
        aluno.setDataNascimento("03/01/1977");
        aluno.setRegistroGeral("65666.6568.6556");
        aluno.setNumeroCpf("03803050626");
        aluno.setNomeMae("Dirce");
        aluno.setNomePai("Gilberto");
        aluno.setDataMatricula("03/01/2020");
        aluno.setNomeEscola("Uninter");
        aluno.setSerieMatriculada("Superior");

        System.out.println("Meu nome e: " + aluno.getNome());
        System.out.println("Minha idade e: " + aluno.getIdade());
        System.out.println("Minha data de nascimento e: " + aluno.getDataNascimento());
        System.out.println("Meu registro geral e: " + aluno.getRegistroGeral());
        System.out.println("Meu CPF e: " + aluno.getNumeroCpf());
        System.out.println("O nome da minha mãe e: " + aluno.getNomeMae());
        System.out.println("O nome do meu pai e: " + aluno.getNomePai());
        System.out.println("minha matricula foi em: " + aluno.getDataMatricula());
        System.out.println("O nome da escola  e: " + aluno.getNomeEscola());
        System.out.println("Estou matriculado em um curso de nível: " + aluno.getSerieMatriculada());

    }

}
