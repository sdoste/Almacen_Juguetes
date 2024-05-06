public class Envio {
    private Dimension dimensiones;
    private double volumen;
    private double precioItem;
    private double precioFinal;

    public Envio(Dimension dimensiones, double precioItem){
        this.dimensiones = dimensiones;
        this.volumen = this.dimensiones.calcularVolumen();
        this.precioItem = precioItem;
        this.precioFinal = calcularPrecioFinal();
    }


    private double calcularPrecioFinal(){
        if (this.volumen <= 1000){
            //gratis
            this.precioFinal = this.precioItem;
        } else if (this.volumen >= 1000 && volumen <= 5000){
            this.precioFinal = this.precioItem + 5;
        } else if (this.volumen >= 5000 && volumen <= 10000){
            this.precioFinal = this.precioItem + 10;
        } else if (this.volumen >= 10000){
            this.precioFinal = this.precioItem + 20;
        }
        return this.precioFinal;
    }

    public double getVolumen() {
        return volumen;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }
}
