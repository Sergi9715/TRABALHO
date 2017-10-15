package Sistema;

import AcessoUsuario.Verificacao;
import Pedido.Adapter;
import Pedido.Nova;
import Relatorios.TXT;
import Relatorios.Relatorio;
import Pedido.Atual;
import AcessoUsuario.Acao;


public class Sistema {

	public static void main(String[] args) {
		Acao acao = new Verificacao();
        acao.executar();
       
        
        Produto copodescartavel200 = new Simples("COPO DESCARTAVEL 200 ML 1X2500  ", 50.f);
        Produto pratoraso = new Simples("PRATO RASO 210 ML 1X1000  ", 40.f);
        Produto colherrefeicao = new Simples("COLHER REFEICAO 1X1000 A GRANEL  ", 30.f);
        Produto guardanapo = new Simples("GUARDANAPO 14X14 1X2000  ", 30.f);
        Produto kitfoliadereis = new Composto(copodescartavel200, pratoraso, colherrefeicao, guardanapo);
        System.out.println(copodescartavel200.getNome() + copodescartavel200.getPreco());
        System.out.println(pratoraso.getNome() + pratoraso.getPreco());
        System.out.println(colherrefeicao.getNome() + colherrefeicao.getPreco());
        System.out.println(guardanapo.getNome() + guardanapo.getPreco());
        System.out.println(kitfoliadereis.getNome() + kitfoliadereis.getPreco() +"\n");
        
        Atual atual = new Adapter(new Nova()); 
        atual.Digitar() ;
         
        Relatorio r = new TXT();
        r.gerarRelatorio();
        
	}

}
