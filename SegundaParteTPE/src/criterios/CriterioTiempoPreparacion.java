package criterios;

import elementos.ElementoComida;

public class CriterioTiempoPreparacion extends Criterio{
    int tiempo;

    public CriterioTiempoPreparacion(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return c.getTiempoPreparacion()<tiempo;
    }
}
