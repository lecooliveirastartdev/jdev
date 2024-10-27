package EstudandoPoo.ProjetoAluno.Auxiliares;

import EstudandoPoo.ProjetoAluno.Interfaces.PermirtirAcesso;

// So quem tem o contrato de permitir de permitir acesso e chamar o autenticar
public class FuncaoAutenticacao {

    private PermirtirAcesso permirtirAcesso;
    private String login;
    private String senha;

    public boolean autenticarProjetoAluno(PermirtirAcesso acesso){

        return permirtirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermirtirAcesso acesso){

        this.permirtirAcesso = acesso;
    }

    public class permirtirAcesso {
    }

    

    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return "FuncaoAutenticacao [permirtirAcesso=" + permirtirAcesso + ", autenticar()=" + autenticar(login, login) + "]";
    }

    public boolean autenticar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticar'");
    }

    
    
    

}
