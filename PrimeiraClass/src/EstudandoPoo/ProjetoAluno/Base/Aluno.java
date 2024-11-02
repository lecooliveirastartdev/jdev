package EstudandoPoo.ProjetoAluno.Base;

import EstudandoPoo.ProjetoAluno.Base.Aluno;
import EstudandoPoo.ProjetoAluno.Constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

  

  private String dataMatricula;
  private String nomeEscola;
  private String serieMatriculada;

  private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

  public List<Disciplina> getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(List<Disciplina> disciplinas) {
    this.disciplinas = disciplinas;
  }

 

  public String getDataMatricula() {
    return dataMatricula;
  }

  public void setDataMatricula(String dataMatricula) {
    this.dataMatricula = dataMatricula;
  }

  public String getNomeEscola() {
    return nomeEscola;
  }

  public void setNomeEscola(String nomeEscola) {
    this.nomeEscola = nomeEscola;
  }

  public String getSerieMatriculada() {
    return serieMatriculada;
  }

  public void setSerieMatriculada(String serieMatriculada) {
    this.serieMatriculada = serieMatriculada;
  }

  public double getMediaNota() { // METODO que calcula a nota do aluno

    double somaNota = 0.0;

    for (Disciplina disciplina : disciplinas) {

      somaNota += disciplina.getMediaNotas();
    }

    return somaNota / disciplinas.size();// VARRER quantos objetos autõmaticos

  }

  public String getResultadoFinal() {
    double media = this.getMediaNota();

    if (media >= 40) {
      if (media >= 60) {
        return StatusAluno.APROVADO;

      } else {
        return StatusAluno.RECUPERACAO;
      }
    } else {

      return StatusAluno.REPROVADO;
    }
  }

  

  

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
        + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
        + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculada=" + serieMatriculada
        + ", disciplinas=" + disciplinas + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
        + ", getDisciplinas()=" + getDisciplinas() + ", getDataNascimento()=" + getDataNascimento()
        + ", getDataMatricula()=" + getDataMatricula() + ", getRegistroGeral()=" + getRegistroGeral()
        + ", getNomeEscola()=" + getNomeEscola() + ", getNumeroCpf()=" + getNumeroCpf() + ", getSerieMatriculada()="
        + getSerieMatriculada() + ", getNomeMae()=" + getNomeMae() + ", getMediaNota()=" + getMediaNota()
        + ", getNomePai()=" + getNomePai() + ", getClass()=" + getClass() + ", getResultadoFinal()="
        + getResultadoFinal() + ", pessoaMaiorIdade()=" + pessoaMaiorIdade() + ", hashCode()=" + hashCode()
        + ", toString()=" + super.toString() + "]";
  }

  @Override
  public boolean pessoaMaiorIdade() {

    return idade >= 21;
  }

  

  

}
