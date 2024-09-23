package EstudandoPoo.ProjetoAluno.Test;

import javax.swing.JOptionPane;

import EstudandoPoo.ProjetoAluno.Base.Aluno;

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

        Aluno aluno = new Aluno();

        aluno.setNome(nome);
        aluno.setIdade(Integer.valueOf(idade));
        aluno.setDataNascimento(dataNascimento);
        aluno.setRegistroGeral(registroGeral);
        aluno.setNumeroCpf(numeroCpf);
        aluno.setNomeMae(nomeMae);
        aluno.setNomePai(nomePai);
        aluno.setDataMatricula(dataMatricula);
        aluno.setNomeEscola(nomeEscola);
        aluno.setSerieMatriculada(serieMatriculada);
        aluno.setNota1(Integer.valueOf(90));
        aluno.setNota2(Integer.valueOf(90));
        aluno.setNota3(Integer.valueOf(90));
        aluno.setNota4(Integer.valueOf(90));

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
        System.out.println("A media de sua nota foi: " + aluno.getMediaNota());
        System.out.println(" Resultado: " + aluno.getResultadoFinal());

    }

}
