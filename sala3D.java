public class sala3D extends Reserva {
    
    private double valorLentes;

    public sala3D(String codigo, String nombrePelicula, double costoBase, double valorLente) {
        super(codigo,nombrePelicula,costoBase);
        this.valorLentes = valorLentes;

    }

     public double getValorLente() {
        return valorLentes;
    }


    @Override
    public String ObtenerDetalles() {
    return super.ObtenerDetalles()+"valorLentes:"+ valorLentes;
    
    }
    
    }
