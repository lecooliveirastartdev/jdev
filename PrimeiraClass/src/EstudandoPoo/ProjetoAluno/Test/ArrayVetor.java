package EstudandoPoo.ProjetoAluno.Test;

import javax.swing.JOptionPane;

public class ArrayVetor {

    // Método MEN Usado para executar codigo.
    public static void main(String[] args) {

        /* Array pode ser de todos os tipos de dados e objetos também. */

        String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");

        /* Array deve ter quantidade de posições definidas */
        double notas[] = new double[Integer.parseInt(posicoes)];// Interger.parseInt Recebe uma string e retorna para
                                                                // inteiro

        for (int pos = 0; pos < notas.length; pos++) {/* Length significa que o calculo le o tamanho do Array */
            String valor = JOptionPane.showInputDialog("Qual o valor da posição? " + pos);
            notas[pos] = Double.valueOf(valor);

        }
        
        
        for (int pos = 0; pos < notas.length; pos++){

            System.out.println("Nota " + (pos+1) + " é " + notas[pos]);
        }
    }

}
