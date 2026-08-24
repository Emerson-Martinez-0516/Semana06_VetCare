public  abstract class Mascota {

    private String nombre;
    private String color;
    private int edadMeses;
    private String raza;
    private double pesoLibras;
    private String codigoPaciente;

    public Mascota(
            String nombre,
            String color,
            int edadMeses,
            String raza,
            double pesoLibras,
            String codigoPaciente
    ) {
        this.nombre = nombre;
        this.color = color;
        this.edadMeses = edadMeses;
        this.raza = raza;
        this.pesoLibras = pesoLibras;
        this.codigoPaciente = codigoPaciente;
    }

    public Mascota ( String nombre){
        this.nombre = nombre;
    }


    public void actualizarPeso(double nuevoPeso){
        if(nuevoPeso > 0){
            this.pesoLibras = nuevoPeso;
        }else {
            System.out.println("Peso inválido");
        }
    }

    public String mostrarInformacion(){
        return nombre + " | " + edadMeses + " | " + pesoLibras + " lb";
    }

    public abstract void emitirSonido();

    public abstract double calcularCostoConsulta();
}
