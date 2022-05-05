public class Producto {
    private String nombre;
    private float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public static Producto generarRobot() {
        String nombre = RobotUtils.generarNombreRobot();
        return new Producto(nombre);
    }


    @Override
    public String toString() {
        return "Producto{" + "nombre='" + nombre + '\'' +
                ", precio=" + String.format("%.2f", precio) + '}';
    }
}
