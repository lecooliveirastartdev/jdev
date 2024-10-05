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

        for (int pos = 1; pos <= 4; pos++) {

            String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + " ?");
            String notaDisciplina = JOptionPane.showInputDialog("Qual foi a nota desta disciplina " + pos + "?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplina);

        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

        if (escolha == 0) {// "Opção SIM e ZERO"

            int continuarRemover = 0;

            while (continuarRemover == 0) {

                String disciplinaRemover = JOptionPane
                        .showInputDialog("Qual a disciplina deseja remover ?  [1] [2] [3] ou [4]");
                aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);

                continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");

                if



            }

        }
        System.out.println(aluno1);// Descrição do objeto na memoria
        System.out.println("A media de sua nota foi: " + aluno1.getMediaNota());
        System.out.println(" Resultado: " + aluno1.getResultadoFinal());

    }

}
