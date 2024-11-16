package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
    private int nPasajero;
    private int nPuerta;
    private double capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private String velocidadCrucero;
    private int nBolsasAire;
    private boolean ABS;
    private boolean sensorcolision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenciaCarril;

    public Sedan(String marca, String modelo, String estado, String cilindraje, String velocidadMaxima,
            TipoCombustible tipoDeCombustible, TipoTransmision tipoDeTransmision, int nPasajero, int nPuerta,
            double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, String velocidadCrucero,
            int nBolsasAire, boolean aBS, boolean sensorcolision, boolean sensorTraficoCruzado,
            boolean asistentePermanenciaCarril) {
        super(marca, modelo, estado, cilindraje, velocidadMaxima, tipoDeCombustible, tipoDeTransmision);
        this.nPasajero = nPasajero;
        this.nPuerta = nPuerta;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.nBolsasAire = nBolsasAire;
        ABS = aBS;
        this.sensorcolision = sensorcolision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
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

    public String getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(String velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
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

    public boolean isSensorcolision() {
        return sensorcolision;
    }

    public void setSensorcolision(boolean sensorcolision) {
        this.sensorcolision = sensorcolision;
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    @Override
    public String toString() {
        return "Sedan [nPasajero=" + nPasajero + ", nPuerta=" + nPuerta + ", capacidadMaletero=" + capacidadMaletero
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", velocidadCrucero=" + velocidadCrucero + ", nBolsasAire=" + nBolsasAire + ", ABS=" + ABS
                + ", sensorcolision=" + sensorcolision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", asistentePermanenciaCarril=" + asistentePermanenciaCarril + "]";
    }

    @Override
    public void mostrarDetalles() {
        // TODO Auto-generated method stub
        
    }

    

}
