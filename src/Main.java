public class Main {
    public static void main(String[] args){

        Mascota perro1 = new Perro("Rocky", "Café", 24, "Labrador", 30, "M002");
        Mascota gato1 = new Gato("Pepe", "Gris con blanco", 1, "Felino", 3, true, "M001");
        Mascota ave1 = new Ave("Pepito", "Verde", 18, "Exotica", 1, "M003");

        Mascota[] mascotas = { perro1, gato1, ave1 };

         for (Mascota m : mascotas) {
            m.emitirSonido();
            System.out.println("Info: " + m.mostrarInformacion());
            System.out.println("Costo de consulta: Q" + m.calcularCostoConsulta());
            System.out.println("-------------------------");
        }

    }
}
