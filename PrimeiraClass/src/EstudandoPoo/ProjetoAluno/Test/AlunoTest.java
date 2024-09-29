package EstudandoPoo.ProjetoAluno;

import javax.swing.JOptionPane;
import EstudandoPoo.ProjetoAluno.Base.Aluno;
import EstudandoPoo.ProjetoAluno.Base.Disciplina;
import java.util.ArrayList;
import java.util.List;


public class AlunoTest {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
        String idade = JOptionPane.showInputDialog("Qual a sua idade");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data do seu nascimento");
        String registroGeral = JOptionPane.showInputDialog("Informe seu registro geral");
        String numeroCpf = JOptionPane.showInputDialog("Informe o numero do CPF");
        String nomeMae = JOptionPane.showInputDialog("Qual o nome de sua mãe");
        String nomePai = JOptionPane.showInputDialog("Qual o nome do seu pai");
        String dataMatricula = JOptionPane.showInputDialog("Digite a data de sua matricula");
        String nomeEscola = JOptionPane.showInputDialog("Qual o nome de sua escola");
        String serieMatriculada = JOptionPane.showInputDialog("Qual a serie matriculada");
        String nota1 = JOptionPane.showInputDialog("Digite a primeira nota");
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota");
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota");
        String nota4 = JOptionPane.showInputDialog("Digite a quarta nota");

        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculada(serieMatriculada);

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de Dados");
        disciplina1.setNota(90);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Matemática");
        disciplina2.setNota(80);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Geografia");
        disciplina3.setNota(97);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Java Web");
        disciplina4.setNota(70);

        aluno1.getDisciplinas().add(disciplina1);
        aluno1.getDisciplinas().add(disciplina2);
        aluno1.getDisciplinas().add(disciplina3);
        aluno1.getDisciplinas().add(disciplina4);

        System.out.println("Meu nome e: " + aluno1.getNome());
        System.out.println("Minha idade e: " + aluno1.getIdade());
        System.out.println("Minha data de nascimento e: " + aluno1.getDataNascimento());
        System.out.println("Meu registro geral e: " + aluno1.getRegistroGeral());
        System.out.println("Meu CPF e: " + aluno1.getNumeroCpf());
        System.out.println("O nome da minha mãe e: " + aluno1.getNomeMae());
        System.out.println("O nome do meu pai e: " + aluno1.getNomePai());
        System.out.println("minha matricula foi em: " + aluno1.getDataMatricula());
        System.out.println("O nome da escola  e: " + aluno1.getNomeEscola());
        System.out.println("Estou matriculado em um curso de nível: " + aluno1.getSerieMatriculada());
        System.out.println("A media de sua nota foi: " + aluno1.getMediaNota());
        System.out.println(" Resultado: " + aluno1.getResultadoFinal());

    }

}
