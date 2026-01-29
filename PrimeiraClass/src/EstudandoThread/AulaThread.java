package EstudandoThread;

import javax.swing.JOptionPane;

public class AulaThread {

    public static void main(String[] args) throws InterruptedException {

        new Thread() {

            public void run() {/* Executa o que nos queremos */

                /* Codigo da rotina que eu quero executar em paraleelo */
                for (int pos = 0; pos < 10; pos++) {

                    // Quero executar este envio com tempo de parada, ou com tempo determinado
                    System.out.println("Executando alguma rotina, por exemplo enviar email");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // Da um tempo determinado para executar cada linha
                }
                /* Fim do codigo */

            };
            
            /* Codigo da rotina */
        }.start(); /* Liga a Tread que fica processando paralelamente */

        /* Codigo do sistema do usuário continua fluxo de trabalho */
        System.out.println("---------------- Thread em segundo plano --------------------------------");
        /* Fluxo do sistema */
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }
}
