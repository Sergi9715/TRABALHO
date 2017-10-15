package Sistema;

public class Composto implements Produto{
	
	    private Produto produto1;
	    private Produto produto2;
	    private Produto produto3;
	    private Produto produto4;
	    
	    public Composto(Produto produto1, Produto produto2, Produto produto3, Produto produto4){
	        this.produto1 = produto1;
	        this.produto2 = produto2;
	        this.produto3 = produto3;
	        this.produto4 = produto4;
	    }
	    
	    @Override
	    public String getNome(){
	        return produto1.getNome() + "+  " + produto2.getNome() + "+  " + produto3.getNome() + "+  " + produto4.getNome();   
	    }
	    
	    @Override
	    public Float getPreco(){
	        return produto1.getPreco() + produto2.getPreco() + produto3.getPreco() + produto1.getPreco();
	    }

}
