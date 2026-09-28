/**
 * Cesar Emilio Agustin Cortes
 */
public class Vehiculo {
    private String placa;
    protected double tarifaBase;

    public Vehiculo(String placa, double tarifaBase) {
        this.placa = placa;
        if (tarifaBase >= 0) {
            this.tarifaBase = tarifaBase;
        } else {
            this.tarifaBase = 50.0; 
        }
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public double getTarifaBase() { return tarifaBase; }
    public void setTarifaBase(double tarifaBase) {
        if (tarifaBase >= 0) this.tarifaBase = tarifaBase;
    }
}