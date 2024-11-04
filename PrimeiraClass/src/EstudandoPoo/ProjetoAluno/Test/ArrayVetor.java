package EstudandoPoo.ProjetoAluno.Test;

import javax.swing.JOptionPane;

import EstudandoPoo.ProjetoAluno.Base.Aluno;
import EstudandoPoo.ProjetoAluno.Base.Disciplina;

public class ArrayVetor {

    // Método MEN Usado para executar codigo.
    public static void main(String[] args) {

        double[] notas = { 8.8, 9.7, 7.6, 6.8 };
        double[] notasLogica = { 7.1, 10, 8.4, 9.2 };

        // Criação do Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Alexandro Oliveira");
        aluno.setNomeEscola("JDEV Treinamentos");

        // Criação da Disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Cueso de Java");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Lógica de programação");
        disciplina2.setNota(notasLogica);

        aluno.getDisciplinas().add(disciplina2);

        System.out.println("Nome : " + aluno.getNome() + " / " + " Inscrito no curso : " + aluno.getNomeEscola());

        for (Disciplina d : aluno.getDisciplinas()) {

            System.out.println("---------- Disciplina do aluno ----------");
            System.out.println("Disciplina : " + d.getDisciplina());
            System.out.println("As notas das disciplinas são : ");

            double notaMax = 0.0;
            double notaMin = 10;

            // Regras de negocio para descobrir a MAIOR e MENOR nota do aluno.
            for (int pos = 0; pos < d.getNota().length; pos++) {

                System.out.println("Nota  " + pos + " E igual = " + d.getNota()[pos]);

                if (pos == 0) {

                    notaMax = d.getNota()[pos];

                } else {
                    if (d.getNota()[pos] > notaMax) {
                        notaMax = d.getNota()[pos];
                    }
                }

                if (pos == 0) {

                    notaMin = d.getNota()[pos];
                } else {
                    if (d.getNota()[pos] < notaMin)
                        notaMin = d.getNota()[pos];

                }

            }
            System.out.println("A maior nota da disciplina = " + d.getDisciplina() + " e de valor : " + notaMax);
            System.out.println("A menor nota da disciplina = " + d.getDisciplina() + " e de valor : " + notaMin);
        }

        /*
         * Array pode ser de todos os tipos de dados e objetos também.
         * 
         * String posicoes =
         * JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
         * 
         * Array deve ter quantidade de posições definidas
         * double notas[] = new double[Integer.parseInt(posicoes)];// Interger.parseInt
         * Recebe uma string e retorna para
         * // inteiro
         * 
         * for (int pos = 0; pos < notas.length; pos++) {/* Length significa que o
         * calculo le o tamanho do Array
         * String valor = JOptionPane.showInputDialog("Qual o valor da posição? " +
         * pos);
         * notas[pos] = Double.valueOf(valor);
         * 
         * }
         * 
         * 
         * for (int pos = 0; pos < notas.length; pos++){
         * 
         * System.out.println("Nota " + (pos+1) + " é " + notas[pos]);
         * }
         */
    }

}
