public class Dimension {
    private double ancho;
    private double alto;
    private double profundidad;


    public Dimension(double ancho, double alto, double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    public double calcularVolumen(){
        return this.ancho * this.alto * this.profundidad;
    }

    public double getAlto() {
        return alto;
    }
    public double getAncho() {
        return ancho;
    }
    public double getProfundidad() {
        return profundidad;
    }

}
