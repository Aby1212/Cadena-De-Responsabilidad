package DenominacionesConcreteHandler;

import Cajero.BaseHandlerDispensador;

public class Denominacion20 extends BaseHandlerDispensador {

    @Override
    public void retirar(int cantidad) {
        if (cantidad >= 20000) {
            int num = cantidad / 20000;
            int resto = cantidad % 20000;
            System.out.println("Se retiraron " + num + " billetes de 20.000");
            if (resto != 0)
                siguiente.retirar(resto);
        } else {
            siguiente.retirar(cantidad);
        }

    }


}
