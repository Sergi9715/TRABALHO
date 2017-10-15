package AcessoUsuario;

public class Requisicao implements Acao{
	
	protected Requisicao(){
        
    }
    
    @Override
    public void executar(){
        
        System.out.println("Acesso Liberado!!!" +" \n");
    }

}
