package EstudandoPoo.ProjetoAluno.Test;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

    public static void main(String[] args) {

        String text = "Alex, Curso Java, 80, 70, 90, 89";

        String[] valoresArrey = text.split(",");

        System.out.println("Nome: " + valoresArrey[0]);
        System.out.println("Curso: " + valoresArrey[1]);
        System.out.println("Nota 1: " + valoresArrey[2]);
        System.out.println("Nota 2: " + valoresArrey[3]);
        System.out.println("Nota 3: " + valoresArrey[4]);
        System.out.println("Nota 4: " + valoresArrey[5]);

        System.out.println("---------------------------------------------------------------");

        // Convertendo um Array em uma lista
        List<String> list = Arrays.asList(valoresArrey);

        for (String valorString : list) {

            System.out.println(valorString);

        }

        System.out.println("---------------------------------------------------------------");

        // Converter uma lista para Array
        String[] conversaoArray = list.toArray(new String[6]);

        for (int pos = 0; pos < conversaoArray.length; pos++) {

            System.out.println(conversaoArray[pos]);

        }

    }

}
