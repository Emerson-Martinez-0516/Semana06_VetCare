public class Gato extends Mascota {
    private boolean interior;
    private String raza;

    public Gato(
            String nombre,
            String color,
            int edadMeses,
            String raza,
            double pesoLibras,
            boolean interior,
            String codigoPaciente){
        super(nombre, color, edadMeses, raza, pesoLibras,codigoPaciente);
        this.interior = interior;
    }

    @Override
    public void emitirSonido(){
        System.out.println("!!MIAUUU");
    }

    // Getters
    public boolean isEsInterior() {
        return interior;
    }

    public String getRaza() {
        return raza;
    }

    // Setters
    public void setEsInterior(boolean interior) {
        this.interior = interior;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        if (interior) {
            return 90.00;
        } else {
            return 105.00;
        }
    }
}
