package elementos;

import criterios.*;

import java.util.ArrayList;


public class Cocina {

    private ArrayList<ElementoComida> pedidos= new ArrayList<ElementoComida>();

    //para cuando se tiene una condicion
    public Cocina(ArrayList<ElementoComida> pedido) {
        this.pedidos=pedido;
    }


    public double aplicoExtra(PorcentajeAplicado cocina){
        double totalAcobrar=0;
        for(ElementoComida c:pedidos){
            totalAcobrar= totalAcobrar + cocina.aplicar(c);
        }
        return totalAcobrar;
    }


}