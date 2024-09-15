package EstudandoClasse;
public class EstudandoForContinue {
    public static void main(String[] args) {
        
        for(int cont = 0; cont<=10; cont++){

            if (cont ==3 || cont ==6 || cont==9){
                System.out.println("Achei Ôh: " +cont);
                continue;
            }
        }
    }

}
