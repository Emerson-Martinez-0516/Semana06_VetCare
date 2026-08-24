public class Perro extends Mascota {
    private double peso;

    public Perro(
            String nombre,
            String color,
            int edadMeses,
            String raza,
            double pesoKg,
            String codigoPaciente){
        super(nombre,color,edadMeses,raza, pesoKg, codigoPaciente );
        this.peso = pesoKg;
    }

    public void emitirSonido(){
        System.out.println("¡Guauuuuuu!");
    }

    @Override
    public double calcularCostoConsulta(){
        if(peso > 25){
            return 125.00;
        }else {
            return 100.00;
        }
    }

}
