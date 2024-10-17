package EstudandoPoo.ProjetoAluno.Base;

public class Secretario extends Pessoa {

    private String redistro;
    private String nivelCargo;
    private String experiencia;
    public String getRedistro() {
        return redistro;
    }
    public void setRedistro(String redistro) {
        this.redistro = redistro;
    }
    public String getNivelCargo() {
        return nivelCargo;
    }
    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    @Override
    public String toString() {
        return "Secretario [redistro=" + redistro + ", nivelCargo=" + nivelCargo + ", nome=" + nome + ", experiencia="
                + experiencia + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
                + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
                + ", getRedistro()=" + getRedistro() + ", getNivelCargo()=" + getNivelCargo() + ", getNome()="
                + getNome() + ", getIdade()=" + getIdade() + ", getExperiencia()=" + getExperiencia()
                + ", getDataNascimento()=" + getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral()
                + ", getNumeroCpf()=" + getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()="
                + getNomePai() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + ", hashCode()="
                + hashCode() + "]";
    }
    @Override
    public double salario() {
        // TODO Auto-generated method stub
        return 1800.80 * 0.9;
    }


    

    

}
