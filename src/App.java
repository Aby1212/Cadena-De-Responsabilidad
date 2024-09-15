import java.util.Scanner;

import Cajero.HandlerDispensador;
import DenominacionesConcreteHandler.Denominacion10;
import DenominacionesConcreteHandler.Denominacion100;
import DenominacionesConcreteHandler.Denominacion20;
import DenominacionesConcreteHandler.Denominacion5;
import DenominacionesConcreteHandler.Denominacion50;

public class App {

    private HandlerDispensador handlerdispensador;

    public App() {

        Denominacion100 d100 = new Denominacion100();
        Denominacion50 d50 = new Denominacion50();
        Denominacion20 d20 = new Denominacion20();
        Denominacion10 d10 = new Denominacion10();
        Denominacion5 d5 = new Denominacion5();

        d100.SSiguiente(d50);
        d50.SSiguiente(d20);
        d20.SSiguiente(d10);
        d10.SSiguiente(d5);

        this.handlerdispensador = d100;

    }

    public void retirar(int cantidad) {
        handlerdispensador.retirar(cantidad);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        App retiro = new App();

        System.out.print("Ingresar la cantidad a retirar: ");
        int cantidad = scanner.nextInt();

        try {
            retiro.retirar(cantidad);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }


}
