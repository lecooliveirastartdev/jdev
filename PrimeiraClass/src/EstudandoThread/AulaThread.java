package EstudandoThread;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {

        for (int pos = 0; pos < 10; pos++) {

            // Quero executar este envio com tempo de parada, ou com tempo determinado
            System.out.println("Executando alguma rotina, por exemplo enviar email");
            Thread.sleep(1000); // Da um tempo determinado para executar cada linha
        }

        System.out.println("----------------Fim da execução de Teste --------------------------------");
    }
}
