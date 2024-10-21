package EstudandoPoo.ProjetoAluno.Auxiliares;

import EstudandoPoo.ProjetoAluno.Interfaces.PermirtirAcesso;

// So quem tem o contrato de permitir de permitir acesso e chamar o autenticar
public class FuncaoAutenticacao {

    private PermirtirAcesso permirtirAcesso;

    public boolean autenticarProjetoAluno(PermirtirAcesso acesso){

        return permirtirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermirtirAcesso acesso){

        this.permirtirAcesso = acesso;
    }

    public class permirtirAcesso {
    }

    public boolean autenticar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticar'");
    }
    

}
