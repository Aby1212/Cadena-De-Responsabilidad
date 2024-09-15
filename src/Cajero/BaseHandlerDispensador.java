package Cajero;

public abstract class BaseHandlerDispensador implements HandlerDispensador {

    protected HandlerDispensador siguiente;

    @Override
    public void SSiguiente(HandlerDispensador siguiente) {

        this.siguiente = siguiente;

    }

    @Override
    public void retirar(int cantidad) {

       if (siguiente != null) {
        siguiente.retirar(cantidad);
       }else{
        throw new IllegalArgumentException("Cantidad no válida");
       }
    }

}
