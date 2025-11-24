public class Reserva {
    

    private String codigo;
    private String nombrePelicula;
    private double costoBase;
    

    public Reserva(String codigo, String nombrePeliculas, double costoBase) {
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase= costoBase;
    
    }

    // Getters y Setters
    public String getcodigo() {
        return codigo;
    }
                

    public String getnombrePelicula() {
        return nombrePelicula;
    }


    public void setnombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public double getcostoBase() {
        return costoBase;
    }

    public void setcostoBase(double costoBase) {
        this.costoBase = costoBase;


    }

    public double calcularCosto() {
        return costoBase; 
    }


    public String ObtenerDetalles (){
        String resultado = "CODIGO:"+ codigo +"NombrePelicula:"+ nombrePelicula +"costoBase:"+ costoBase;

        return resultado;
        
    }
}

   
