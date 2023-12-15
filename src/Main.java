// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Funciones obj = new Funciones();
        obj.pedirAlias("");
        obj.generarNumero(1,10);
        obj.pedirNumero();
        obj.instertarNumero(5);
        obj.sumarAciertos(3,5);
        obj.calcularPuntuacionFinal();
        obj.calcularFallos();
        obj.guardarRecord();

        System.out.println(obj.guardarRecord());

    }
}