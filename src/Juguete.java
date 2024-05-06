public class Juguete {
    private String nombre;
    private double precio;
    private Dimension dimensiones;
    private Envio envio;

    public Juguete(String nombre, double precio, Dimension dimensiones){
        this.nombre = nombre;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.envio = new Envio(dimensiones, precio);
    }

    @Override
    public String toString() {
        return "Juguete " + nombre + ", precio: " + precio + " euros. Dimensiones:" + dimensiones.getAncho() + " x " + dimensiones.getAncho() + " x " + dimensiones.getProfundidad()
        + "cm. El volumen es de " + envio.getVolumen() + "cm3" + " y el precio final es de " + envio.getPrecioFinal() + " euros";
    };

    
}
