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

    public void addPedido(ElementoComida p){
        pedidos.add(p);
    }
    //deriva a cada comida en la lista del pedido a una estacion segun el criterio que se le de
    public ArrayList<ElementoComida> derivoEstaciones(Criterio criterio){
        ArrayList<ElementoComida> cocinar = new ArrayList<>();
        for(ElementoComida c:pedidos){
            if (criterio.cumple(c))
                cocinar.add(c);
        }
        return cocinar;
    }

}
