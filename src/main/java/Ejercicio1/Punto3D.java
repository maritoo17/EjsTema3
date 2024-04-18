package Ejercicio1;

public class Punto3D {
    private int x;
    private int y;
    private int z;

    public Punto3D() {
        this(0, 0, 0);
    }

    public Punto3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Punto3D{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
