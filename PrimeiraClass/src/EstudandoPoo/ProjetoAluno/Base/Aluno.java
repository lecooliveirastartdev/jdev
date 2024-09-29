package EstudandoPoo.ProjetoAluno;

import javax.swing.JOptionPane;
import EstudandoPoo.ProjetoAluno.Base.Aluno;
import EstudandoPoo.ProjetoAluno.Base.Disciplina;
import java.util.ArrayList;
import java.util.List;
import EstudandoPoo.ProjetoAluno.Base.Disciplina;

public class Aluno {

  private String nome;
  private int idade;
  private String dataNascimento;
  private String registroGeral;
  private String numeroCpf;
  private String nomeMae;
  private String nomePai;
  private String dataMatricula;
  private String nomeEscola;
  private String serieMatriculada;

  private List<Disciplina> disciplinas  = new ArrayList<Disciplina>();

  public List<Disciplina> getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(List<Disciplina> disciplinas) {
    this.disciplinas = disciplinas;
  }



  public void setNome(String nome) { // SETE é para adicionar ou receber dados para os atributos
    this.nome = nome;
  }

  public String getNome() { // GET é para resgatar ou obter o vaçor do atribruto
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;

  }

  public int getIdade() {
    return idade;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getRegistroGeral() {
    return registroGeral;
  }

  public void setRegistroGeral(String registroGeral) {
    this.registroGeral = registroGeral;
  }

  public String getNumeroCpf() {
    return numeroCpf;
  }

  public void setNumeroCpf(String numeroCpf) {
    this.numeroCpf = numeroCpf;
  }

  public String getNomeMae() {
    return nomeMae;
  }

  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  public String getNomePai() {
    return nomePai;
  }

  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
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
    
    for(Disciplina disciplina : disciplinas){

      somaNota += disciplina.getNota();
    }

    return somaNota / disciplinas.size();//VARRER quantos objetos autõmaticos

  }

  public String getResultadoFinal() {
    double media = this.getMediaNota();

    if (media >= 60) {
      return "Aluno aprovado ";

    }
    if (media <= 40) {
      return "Aluno em recuperação ";

    } else {
      return "Aluno reprovado ";
    }

  }

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
        + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
        + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculada=" + ", getNome()="
        + getNome() + ", getIdade()=" + getIdade()
        + ", getDataNascimento()=" + getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral()
        + ", getNumeroCpf()=" + getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai()
        + ", getClass()=" + getClass() + ", getDataMatricula()=" + getDataMatricula() + ", getNomeEscola()="
        + getNomeEscola() + ", getSerieMatriculada()=" + getSerieMatriculada() + ", getDisciplina()="
        + ", getMediaNota()=" + getMediaNota() + ", getResultadoFinal()=" + getResultadoFinal() + ", hashCode()="
        + hashCode() + ", toString()=" + super.toString() + "]";
  }

  public char[] materias() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'materias'");
  }

 

}
