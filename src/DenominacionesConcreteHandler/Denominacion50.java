package DenominacionesConcreteHandler;

import Cajero.BaseHandlerDispensador;

public class Denominacion50 extends BaseHandlerDispensador {

    @Override
    public void retirar(int cantidad) {
        if (cantidad >= 50000) {
            int num = cantidad / 50000;
            int resto = cantidad % 50000;
            System.out.println("Se retiraron " + num + " billetes de 50.000");
            if (resto != 0)
                siguiente.retirar(resto);
        } else {
            siguiente.retirar(cantidad);
        }

    }

}
