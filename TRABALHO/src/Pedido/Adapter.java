package Pedido;

public class Adapter extends Atual{
    
    private Nova nova;

    public Adapter(Nova nova) {
        this.nova = nova;
    }
    
    @Override
    public void Digitar(){
        nova.CriaPedido("Serginho ");
    }

    
}
