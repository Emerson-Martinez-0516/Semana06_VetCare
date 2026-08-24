public class Main {
    public static void main(String[] args){

        Mascota ave1 = new Ave("Chato",
                "verde",
                18,
                "Exotica",
                1,
                "MA01");


        Mascota gato1 = new Gato(
                "Pepe",
                "Gris con blanco",
                1,
                "Felino",
                3,
                true,
                "MGO1");

        Mascota perro1 = new Perro(
                "Canela",
                "Cafe claro",
                22,
                "Canino",
                3,
                "MP01"
        );

        ave1.emitirSonido();
        gato1.emitirSonido();
        perro1.emitirSonido();



    }
}
