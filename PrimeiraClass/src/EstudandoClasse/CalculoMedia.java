package EstudandoClasse;

import javax.swing.JOptionPane;

public class CalculoMedia {

    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog("Informe a primeira nota");
        String nota2 = JOptionPane.showInputDialog("Informe a segunda nota");
        String nota3 = JOptionPane.showInputDialog("Informe a terceira nota");
        String nota4 = JOptionPane.showInputDialog("Informe a quarta nota");

        double dnota1 = Double.parseDouble(nota1);
        double dnota2 = Double.parseDouble(nota2);
        double dnota3 = Double.parseDouble(nota3);
        double dnota4 = Double.parseDouble(nota4);

        double somaMedia = (double) (dnota1 + dnota2 + dnota3 + dnota4) / 4;

        if (somaMedia >= 60) {

            JOptionPane.showMessageDialog(null, "Você foi aprovado: " + somaMedia);

        }
        if (somaMedia >=40) {
            JOptionPane.showMessageDialog(null, "Você esta em recuperação: " + somaMedia);

        } else {
            JOptionPane.showMessageDialog(null, "Você foi reprovdo: " + somaMedia);

        }

        JOptionPane.showMessageDialog(null, "Sua media foi: " + somaMedia);

    }

}
