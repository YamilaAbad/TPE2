package criterios;

import elementos.ElementoComida;

public class CriterioModoPreparacion extends Criterio{

    String modo;

    public CriterioModoPreparacion(String modo) {
        this.modo = modo;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return c.getModoPreparacion().equalsIgnoreCase(modo);
    }
}
