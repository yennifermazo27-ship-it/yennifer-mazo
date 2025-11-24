public class Main {
    
    public static void main(String[] args) {

        GestorReservas reserva = new GestorReservas(4);
        
        Reserva sala1 = new SalaTradicional("01", "After", 10000, 140);
        Reserva sala2 = new SalaTradicional("02", "Culpa mia", 12000, 120);
        Reserva sala3D1 = new sala3D("03", "Telefono negro", 20000, 5000);
        Reserva sala3D2 = new sala3D("04", "los minios", 18000, 4000);

        reserva.agregarReserva(sala1);
        reserva.agregarReserva(sala2);
        reserva.agregarReserva(sala3D1);
        reserva.agregarReserva(sala3D2);

        double total = 0;

        for(int i = 0; i < reserva.getReservas().length; i++){
            System.out.println(reserva.getReservas()[i].ObtenerDetalles());
            total += reserva.getReservas()[i].calcularCosto(); 

            
        }

        System.out.println("\nTotal: $" + total);
    }

}