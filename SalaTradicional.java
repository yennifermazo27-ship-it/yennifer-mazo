
public class SalaTradicional extends Reserva {

    private int duracionMin ;

    public SalaTradicional(String codigo, String nombrePeliculas, double costoBase,int duracionMin) {
        super(codigo, nombrePeliculas, costoBase);

        this.duracionMin= duracionMin;
    }
    public int getduracionMin(){
        return duracionMin;
    }

    public void setduracionMin(int duracionMin){
    this.duracionMin= duracionMin;
    }

    @Override
    public String ObtenerDetalles(){

    String resultado = super.ObtenerDetalles();
        resultado += "DURACION"+ duracionMin + "min";

    return resultado;

    }
    }



