package co.edu.uniquindio.poo;

public class Bus extends Vehiculo {
    private int nPasajero;
    private int nPuerta;
    private double capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int nBolsasAire;
    private boolean ABS;
    private int nEjes;
    private int nSalidaEmergencia;

    public Bus(String marca, String modelo, String estado, String cilindraje, String velocidadMaxima,
            TipoCombustible tipoDeCombustible, TipoTransmision tipoDeTransmision, int nPasajero, int nPuerta,
            double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int nBolsasAire, boolean aBS,
            int nEjes, int nSalidaEmergencia) {
        super(marca, modelo, estado, cilindraje, velocidadMaxima, tipoDeCombustible, tipoDeTransmision);
        this.nPasajero = nPasajero;
        this.nPuerta = nPuerta;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.nBolsasAire = nBolsasAire;
        ABS = aBS;
        this.nEjes = nEjes;
        this.nSalidaEmergencia = nSalidaEmergencia;
    }

    public int getnPasajero() {
        return nPasajero;
    }

    public void setnPasajero(int nPasajero) {
        this.nPasajero = nPasajero;
    }

    public int getnPuerta() {
        return nPuerta;
    }

    public void setnPuerta(int nPuerta) {
        this.nPuerta = nPuerta;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getnBolsasAire() {
        return nBolsasAire;
    }

    public void setnBolsasAire(int nBolsasAire) {
        this.nBolsasAire = nBolsasAire;
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

    public int getnSalidaEmergencia() {
        return nSalidaEmergencia;
    }

    public void setnSalidaEmergencia(int nSalidaEmergencia) {
        this.nSalidaEmergencia = nSalidaEmergencia;
    }

    @Override
    public String toString() {
        return "Bus [nPasajero=" + nPasajero + ", nPuerta=" + nPuerta + ", capacidadMaletero=" + capacidadMaletero
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", nBolsasAire="
                + nBolsasAire + ", ABS=" + ABS + ", nEjes=" + nEjes + ", nSalidaEmergencia=" + nSalidaEmergencia + "]";
    }

}
