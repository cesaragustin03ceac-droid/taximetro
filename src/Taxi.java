/**
 *Cesar Emilio Agustin Cortes
 *.
 */
public class Taxi extends Vehiculo {
    private int viajesRealizados;

    public Taxi(String placa, double tarifaBase) {
        super(placa, tarifaBase);
        this.viajesRealizados = 0;
    }

    public void registrarViaje() {
        viajesRealizados++;
    }

    public void aplicarTarifaNocturna() {
        this.tarifaBase += 60.0; 
    }

    // Método Recursivo
    public double calcularCostoRecursivo(int kilometrosRestantes, double costoAcumulado) {
        if (kilometrosRestantes <= 0) {
            return costoAcumulado;
        }
        return calcularCostoRecursivo(kilometrosRestantes - 1, costoAcumulado + 15.0);
    }

    public String generarTicket() {
        return "Placa: " + getPlaca() + 
               "\nViajes hoy: " + viajesRealizados + 
               "\nTarifa Base Actual: $" + getTarifaBase();
    }
}