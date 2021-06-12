package elementos;

import criterios.*;

public class Palacio {

    public static void main(String[] args) {

        //PEDIDO 1
        Pedido p1 = new Pedido(1, "Carlos");
        ComidaSimple c1 = new ComidaSimple("Carpaccio", 250.00, 13, 150, "Ensalada", "Simple");
        ComidaSimple c2 = new ComidaSimple("Margarita", 453.50, 40, 350, "Pizza", "Horno");
        ComidaSimple c3 = new ComidaSimple("Benedict", 80.00, 10, 180, "Huevo", "Frito");
        //Agrego las comidas al pedido 1
        p1.addPedido(c1);
        p1.addPedido(c2);
        p1.addPedido(c3);

        //PEDIDO 2
        Pedido p2 = new Pedido(2, "Horacio");
        ComidaCompleja c4 = new ComidaCompleja("CarpaccioDoble");
        ComidaSimple c5 = new ComidaSimple("Salsa Mozcattinni", 93.50, 15,66,"Salsa","Hervido");
        //Armo el pedido 2 que es una comida compleja que se forma con dos comidas simples
        c4.addComida(c1);
        c4.addComida(c5);
        //Agrego la comida compleja al pedido 2
        p2.addPedido(c4);

        //Condiciones de las estaciones
        Criterio comidasMenoresA = new CriterioTiempoPreparacion(30);
        Criterio comidasPorModo = new CriterioModoPreparacion("Hervido");
        Criterio ComidasPorTipo = new CriterioTipoPreparacion("Ensalada");
        Criterio dobleCondicion = new CriterioAnd(new CriterioTiempoPreparacion(15), new CriterioPorCalorias(500));

        //COCINA
        Cocina instancia1 = new Cocina(p1.comidas);
        Cocina instancia2 = new Cocina(p2.comidas);

        //Imprimo por pantalla las comidas que tarden menos de un tiempo dado
        System.out.println("Comidas que tardan menos de 30 minutos en el primer pedido: "+instancia1.derivoEstaciones(comidasMenoresA));
        //Imprimo por pantalla las comidas que tengan modo de preparacion frito
        System.out.println("Comidas que se preparan con modo hervido en el segundo pedido: "+instancia2.derivoEstaciones(comidasPorModo));
        //imprimo por pantalla una condicion doble con criterio de tiempo menor a 15 y calorias menores a 500
        System.out.println("Comidas que se preparan en menos de 15 min y con menos de 500 calorias pertenecientes al pedido 1: "+instancia1.derivoEstaciones(dobleCondicion));


        //la cocina dará el resultado de cuanto tengo que cobrar en cada pedido dependiendo si se le dará un criterio o un adicional para cobrar, o ambas en su defecto
        PorcentajeAplicado extra1 = new PrecioPorCondicion(comidasPorModo,10.00, 150.00);
        PorcentajeAplicado extra2 = new PrecioPorAdicional(20);

        //TOTAL PEDIDO
        //Total del pedido con una condicion en pedido 1
        System.out.println("El total del pedido sumó: $" + instancia1.aplicoExtra(extra1));
        //total del pedido con un adicional % en pedido 2
        System.out.println("El total del pedido sumó: $" + instancia2.aplicoExtra(extra2));
        //total del pedido con una condicion y un adicional % en pedido 1
        System.out.println("El total del pedido sumó: $" + (instancia1.aplicoExtra(extra1)+instancia1.aplicoExtra(extra2)));
    }
}
