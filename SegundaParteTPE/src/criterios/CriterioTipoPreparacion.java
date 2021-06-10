package criterios;

import elementos.ElementoComida;

public class CriterioTipoPreparacion extends Criterio{
    String tipo;

    public CriterioTipoPreparacion(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumple(ElementoComida c) {
        return c.getTipo().equals(tipo);
    }
}
