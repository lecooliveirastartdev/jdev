package EstudandoPoo.ProjetoAluno.Base;


public class Secretario extends Pessoa{

    private String redistro;
    private String nivelCargo;
    private String experiencia;

    private String login;

    private String senha;

    public Secretario(String login2, String senha2) {
        //TODO Auto-generated constructor stub
    }

    public Secretario() {
        //TODO Auto-generated constructor stub
    }

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
        return "Secretario [redistro=" + redistro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
                + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
                + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
                + ", getRedistro()=" + getRedistro() + ", getNivelCargo()=" + getNivelCargo() + ", getNome()="
                + getNome() + ", getExperiencia()=" + getExperiencia() + ", getDataNascimento()=" + getDataNascimento()
                + ", getIdade()=" + getIdade() + ", getRegistroGeral()=" + getRegistroGeral() + ", getNumeroCpf()="
                + getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai() + ", getClass()="
                + getClass() + ", pessoaMaiorIdade()=" + pessoaMaiorIdade() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    @Override
    public int getIdade() {
        // TODO Auto-generated method stub
        return super.getIdade();
    }

}
