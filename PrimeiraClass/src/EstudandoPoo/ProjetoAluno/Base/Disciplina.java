package EstudandoPoo.ProjetoAluno.Base;

import java.util.Arrays;

import EstudandoPoo.ProjetoAluno.Base.Disciplina;

public class Disciplina {
    /* Cada discplina terá 4 notas durante o ano inteiro */
    private double nota[] = new double[4];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMediaNotas() {

        double somaTotal = 0;

        for (int pos = 0; pos < nota.length; pos++) {
            somaTotal += nota[1];
        }

        return somaTotal / 4;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(nota);
        result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disciplina other = (Disciplina) obj;
        if (!Arrays.equals(nota, other.nota))
            return false;
        if (disciplina == null) {
            if (other.disciplina != null)
                return false;
        } else if (!disciplina.equals(other.disciplina))
            return false;
        return true;
    }

}
