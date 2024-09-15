package DenominacionesConcreteHandler;

import Cajero.BaseHandlerDispensador;

public class Denominacion10 extends BaseHandlerDispensador {

    @Override
    public void retirar(int cantidad) {
        if (cantidad >= 10000) {
            int num = cantidad / 10000;
            int resto = cantidad % 10000;
            System.out.println("Se retiraron " + num + " billetes de 10.000");
            if (resto != 0)
                siguiente.retirar(resto);
        } else {
            siguiente.retirar(cantidad);
        }

    }
   
}
