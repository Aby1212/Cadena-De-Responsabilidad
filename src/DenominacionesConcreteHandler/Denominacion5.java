package DenominacionesConcreteHandler;

import Cajero.BaseHandlerDispensador;

public class Denominacion5 extends BaseHandlerDispensador {


    @Override
    public void retirar(int cantidad){
        if(cantidad >= 5000){
            int num = cantidad / 5000;
            int resto = cantidad % 5000;
            System.out.println("Se retiraron " + num + " billetes de 5.000");
            if (resto != 0) siguiente.retirar(resto);
        } else {
            throw new IllegalArgumentException("Cantidad inválida");
        }

    } 

}
