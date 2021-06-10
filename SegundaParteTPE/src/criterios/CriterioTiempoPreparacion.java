package criterios;

import elementos.ElementoComida;

public class CriterioTiempoPreparacion implements Criterio{
    int tiempo;

    public CriterioTiempoPreparacion(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return c.getTiempoPreparacion()<tiempo;
    }
}
