package elementos;


import java.util.ArrayList;

public class Pedido {
    private int numeroMesa;
    private String nombreMozo;
    public ArrayList<ElementoComida> comidas;

    public Pedido(int numeroMesa, String nombreMozo) {
        this.numeroMesa = numeroMesa;
        this.nombreMozo= nombreMozo;
        comidas= new ArrayList<ElementoComida>();
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public String getNombreMozo() {
        return nombreMozo;
    }

    public void addPedido(ElementoComida p){
        comidas.add(p);
    }


}
