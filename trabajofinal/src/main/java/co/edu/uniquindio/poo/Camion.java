package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenoAire;
    private boolean ABS;
    private int nEjes;
    private String tipoCamion;

    public Camion(String marca, String modelo, String estado, String cilindraje, String velocidadMaxima,
            TipoCombustible tipoDeCombustible, TipoTransmision tipoDeTransmision, double capacidadCarga,
            boolean aireAcondicionado, boolean frenoAire, boolean aBS, int nEjes, String tipoCamion) {
        super(marca, modelo, estado, cilindraje, velocidadMaxima, tipoDeCombustible, tipoDeTransmision);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenoAire = frenoAire;
        ABS = aBS;
        this.nEjes = nEjes;
        this.tipoCamion = tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenoAire() {
        return frenoAire;
    }

    public void setFrenoAire(boolean frenoAire) {
        this.frenoAire = frenoAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public int getnEjes() {
        return nEjes;
    }

    public void setnEjes(int nEjes) {
        this.nEjes = nEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    @Override
    public String toString() {
        return "Camión: Capacidad de carga: " + capacidadCarga + ", Aire acondicionado: " + aireAcondicionado
                + ", Freno de aire: " + frenoAire + ", ABS: " + ABS + ", Número de ejes: " + nEjes
                + ", Tipo de camión: " + tipoCamion + ""
                + super.toString()+"\n";
    }

}
