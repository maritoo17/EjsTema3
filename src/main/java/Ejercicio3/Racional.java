package Ejercicio3;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(Racional otro) {
        this.numerador = otro.numerador;
        this.denominador = otro.denominador;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public Racional sumar(Racional otro) {
        int nuevoNumerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    public Racional multiplicar(Racional otro) {
        int nuevoNumerador = this.numerador * otro.numerador;
        int nuevoDenominador = this.denominador * otro.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
