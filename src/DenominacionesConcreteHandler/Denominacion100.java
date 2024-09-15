package DenominacionesConcreteHandler;

import Cajero.BaseHandlerDispensador;

public class Denominacion100 extends BaseHandlerDispensador {

    @Override
    public void retirar(int cantidad) {
        if (cantidad >= 100000) {
            int num = cantidad / 100000;
            int resto = cantidad % 100000;
            System.out.println("Se retiraron " + num + " billetes de 100.000");
            if (resto != 0)
                siguiente.retirar(resto);
        } else {
            siguiente.retirar(cantidad);
        }

    }

}
