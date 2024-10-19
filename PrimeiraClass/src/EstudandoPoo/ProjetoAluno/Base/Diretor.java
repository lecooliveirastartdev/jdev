package EstudandoPoo.ProjetoAluno.Base;

public class Diretor  extends Pessoa {

private String registroEducacao;
private  int tempoDirecao;
private String titulacao;


public String getRegistroEducacao() {
    return registroEducacao;
}
public void setRegistroEducacao(String registroEducacao) {
    this.registroEducacao = registroEducacao;
}
public int getTempoDirecao() {
    return tempoDirecao;
}
public void setTempoDirecao(int tempoDirecao) {
    this.tempoDirecao = tempoDirecao;
}
public String getTitulacao() {
    return titulacao;
}
public void setTitulacao(String titulacao) {
    this.titulacao = titulacao;
}



@Override
public String toString() {
    return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
            + titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
            + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai="
            + nomePai + ", getRegistroEducacao()=" + getRegistroEducacao() + ", getTempoDirecao()=" + getTempoDirecao()
            + ", getNome()=" + getNome() + ", getTitulacao()=" + getTitulacao() + ", getDataNascimento()="
            + getDataNascimento() + ", getIdade()=" + getIdade() + ", getRegistroGeral()=" + getRegistroGeral()
            + ", getNumeroCpf()=" + getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai()
            + ", getClass()=" + getClass() + ", pessoaMaiorIdade()=" + pessoaMaiorIdade() + ", hashCode()=" + hashCode()
            + ", toString()=" + super.toString() + "]";
}
@Override
public int getIdade() {
    // TODO Auto-generated method stub
    return super.getIdade();
}





}
