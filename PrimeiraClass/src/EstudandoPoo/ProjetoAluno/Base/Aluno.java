package EstudandoPoo.ProjetoAluno.Base;

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
  private double nota1;
  private double nota2;
  private double nota3;
  private double nota4;
  private double mediaNota = (nota1 + nota2 + nota3 + nota4 / 4);

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

  public double getNota1() {
    return nota1;
  }

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public void setNota2(double nota2) {
    this.nota2 = nota2;
  }

  public double getNota3() {
    return nota3;
  }

  public void setNota3(double nota3) {
    this.nota3 = nota3;
  }

  public double getNota4() {
    return nota4;
  }

  public void setNota4(double nota4) {
    this.nota4 = nota4;
  }

  public double getMediaNota() { // METODO que calcula a nota do aluno
    return (nota1 + nota2 + nota3 + nota4) / 4;

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

  

  
}
