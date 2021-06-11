package elementos;

import criterios.*;

import java.util.ArrayList;

public class Pedido {
    private int numeroMesa;
    private String nombreMozo;
    public ArrayList<ElementoComida> pedidos;

    public Pedido(int numeroMesa, String nombreMozo) {
        this.numeroMesa = numeroMesa;
        this.nombreMozo= nombreMozo;
        pedidos= new ArrayList<ElementoComida>();
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void addPedido(ElementoComida p){
        pedidos.add(p);
    }


}
