public class App {
    public static void main(String[] args) throws Exception {
        Juguete juguete1 = new Juguete("Pelota", 10.99, new Dimension(5.0, 5.0, 5.0));
        Juguete juguete2 = new Juguete("Muñeca", 15.50, new Dimension(10.0, 15.0, 5.0));
        Juguete juguete3 = new Juguete("Rompecabezas", 20.75, new Dimension(15.0, 10.0, 3.0));
        Juguete juguete4 = new Juguete("Carro de Control Remoto", 30.25, new Dimension(8.0, 6.0, 4.0));
        Juguete juguete5 = new Juguete("Bloques de Construcción", 25.99, new Dimension(12.0, 8.0, 10.0));
        Juguete juguete6 = new Juguete("Puzzle 1000 Piezas", 35.99, new Dimension(20.0, 30.0, 2.5));
        Juguete juguete7 = new Juguete("Muñeco de Peluche", 18.75, new Dimension(7.0, 7.0, 12.0));
        Juguete juguete8 = new Juguete("Set de Cocina de Juguete", 22.50, new Dimension(15.0, 10.0, 8.0));
        Juguete juguete9 = new Juguete("Avión de Juguete", 28.99, new Dimension(10.0, 5.0, 4.0));
        Juguete juguete10 = new Juguete("Bicicleta de niño", 40.50, new Dimension(50.0, 95.0, 17.0));

        System.out.println(juguete1.toString());
        System.out.println(juguete2.toString());
        System.out.println(juguete3.toString());
        System.out.println(juguete4.toString());
        System.out.println(juguete5.toString());
        System.out.println(juguete6.toString());
        System.out.println(juguete7.toString());
        System.out.println(juguete8.toString());
        System.out.println(juguete9.toString());
        System.out.println(juguete10.toString());


    }
}
