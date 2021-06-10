package elementos;

import criterios.*;


public class Cocina {
    //opciones para elegir
    private static boolean propinaMozo =false;
    private static boolean diaAgitado =false;
    private static boolean diaDeDescuento =false;
    private static boolean tipo =false;
    private static boolean modo =false;
    private static boolean calorias =false;
    private static boolean doble =false;

    //valores por defecto si se elije alguna de las opciones para el dia
    private static Criterio porTipo= new CriterioTipoPreparacion("Ensalada");
    private static Criterio porModo= new CriterioModoPreparacion("Horno");
    private static Criterio porCalorias= new CriterioPorCalorias(500);
    private static Criterio dobleCriterio= new CriterioAnd( new CriterioTipoPreparacion("Salsa"), new CriterioTiempoPreparacion(15));

    private static Criterio criterioDia;

    public Cocina() {
        propinaMozo=true;
        diaAgitado=true;

    }

    public static Criterio getCriterioDia() {
        return criterioDia;
    }

    public static void setCriterioDia(Criterio criterioDia) {
        Cocina.criterioDia = criterioDia;
    }


    public static double criterioDelDia(ElementoComida c) {
        double cobrar=0;
        if(propinaMozo){
            cobrar= cobrar + (c.getPrecio()+(c.getPrecio()*10/100));
        }else{
            if(diaAgitado){
                cobrar= cobrar + (c.getPrecio()+(c.getPrecio()*55/100));
            }else{
                if(diaDeDescuento){
                    cobrar= cobrar + (c.getPrecio()-(c.getPrecio()*20/100));
                }else{
                    if(tipo){
                        criterioDia= porTipo;
                        cobrar= cobrar + criterioElegido(c,10,50);
                    }else{
                        if(modo){
                            criterioDia= porModo;
                            cobrar= cobrar + criterioElegido(c,50,150);
                        }else{
                            if(calorias){
                                criterioDia=porCalorias;
                                cobrar= cobrar + criterioElegido(c,100,0);
                            }
                        }
                    }
                }
            }
        }
        return cobrar;
    }


    public static double criterioElegido(ElementoComida c, int sicumple, int sinocumple) {
        double aCobrar=0;
        if (criterioDia.cumple(c)){
            aCobrar= c.getPrecio()+ sicumple;
        }else {
            aCobrar= c.getPrecio()+ sinocumple;
        }
        return aCobrar;
    }


}