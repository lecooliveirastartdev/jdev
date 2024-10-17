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
    return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", nome=" + nome
            + ", titulacao=" + titulacao + ", idade=" + idade + ", dataNascimento=" + dataNascimento
            + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai="
            + nomePai + ", getRegistroEducacao()=" + getRegistroEducacao() + ", getTempoDirecao()=" + getTempoDirecao()
            + ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getTitulacao()=" + getTitulacao()
            + ", getDataNascimento()=" + getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral()
            + ", getNumeroCpf()=" + getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai()
            + ", getClass()=" + getClass() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode() + "]";
}
@Override
public double salario() {
    // TODO Auto-generated method stub
    return 3900.78;
}





}
