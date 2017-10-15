package Sistema;

public class Simples implements Produto{
	
	private String nome;
    private Float preco;
    
    public Simples(String nome, Float preco){
        this.nome = nome;
        this.preco = preco;
    }

    
    @Override
    public String getNome(){
        return nome;
    }
    
    public Float getPreco(){
        return preco;
    } 

}
