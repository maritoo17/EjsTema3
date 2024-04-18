package Ejercicio2;

public class TestFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(20, 10, 2018);
        System.out.println("Fecha inicial: " + fecha);

        fecha.setAño(2019);
        System.out.println("Fecha modificada: " + fecha);
    }
}
