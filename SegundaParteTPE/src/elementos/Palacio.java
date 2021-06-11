package elementos;

import criterios.*;

public class Palacio {

    public static void main(String[] args) {

        //PEDIDO 1
        Pedido p1 = new Pedido(1, "Carlos");
        ComidaSimple c1 = new ComidaSimple("Carpaccio", 250.00, 13, 150, "Ensalada", "Simple");
        ComidaSimple c2 = new ComidaSimple("Margarita", 453.50, 40, 350, "Pizza", "Horno");
        ComidaSimple c3 = new ComidaSimple("Benedict", 80.00, 10, 180, "Huevo", "Frito");

        p1.addPedido(c1);
        p1.addPedido(c2);
        p1.addPedido(c3);

        //PEDIDO 2
        Pedido p2 = new Pedido(2, "Horacio");
        //ElementoComida c4 = new ComidaCompleja("CarpaccioDoble");
        ComidaCompleja c4 = new ComidaCompleja("CarpaccioDoble");
        ComidaSimple c5 = new ComidaSimple("Salsa Mozcattinni", 93.50, 15,66,"Salsa","Simple");
        c4.addComida(c1);
        c4.addComida(c5);

        p2.addPedido(c4);

        //Condiciones
        Criterio comidasMenoresA = new CriterioTiempoPreparacion(30);
        Criterio comidasPorModo = new CriterioModoPreparacion("Frito");
        Criterio ComidasPorTipo = new CriterioTipoPreparacion("Ensalada");


        System.out.println(p1.derivoEstaciones(comidasMenoresA));
        Cocina cocina1 = new Cocina(p1.pedidos);
        Cocina cocina2 = new Cocina(p2.pedidos);
        PorcentajeAplicado extra1= new PrecioPorCondicion(comidasPorModo,10.00, 150.00);
        PorcentajeAplicado extra2 = new PrecioPorAdicional(20);

        System.out.println("El total del pedido sumó: $" + cocina1.aplicoExtra(extra1)); //no se si este bien este system


        System.out.println(p2.derivoEstaciones(comidasPorModo));
        System.out.println("El total del pedido sumo: $" +cocina2.aplicoExtra(extra2)); //no se si este bien este system
    }
}
