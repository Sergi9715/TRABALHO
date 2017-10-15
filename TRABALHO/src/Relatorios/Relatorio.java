package Relatorios;

public class Relatorio {
	
	public void gerarRelatorio(){
        totalizar();
        geraRed();
        gravaRed();
        exportar();
    }
    
    private void totalizar(){
        System.out.println("Totalizando vendas do dia");
    }
    
    private void geraRed(){
        System.out.println("Gerando Reducao Z");
    }
    private void gravaRed(){
        System.out.println("Gravando Reducao Z");
    }
    
    protected void exportar(){
        System.out.println("Exportando para...");
    }

}
