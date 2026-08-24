public class Ave extends Mascota{
    private String tipo;

    public Ave (
        String nombre,
        String color,
        int edadMeses,
        String tipo,
        double pesoKg,
        String codigoPaciente){
    super(nombre,color,edadMeses,tipo, pesoKg, codigoPaciente );
    this.tipo = tipo;
        }

        //Getters
        public String getTipo(){
        return tipo;
        }

        //Setters
        public void setTipo(String tipo){
        this.tipo = tipo;
        }


        public void emitirSonido(){
            System.out.println("¡Cúcúcú!");
        }

        @Override
        public double calcularCostoConsulta() {
            if (tipo != null && tipo.equalsIgnoreCase("Exotica")) {
                return 105.00;
            } else {
                return 75.00;
            }
        }
    }

