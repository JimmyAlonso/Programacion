package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    private int nPasajero;
    private int nPuerta;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int nBolsasAire;
    private boolean ABS;
    private boolean cuatrox4;
    private String capacidadCajaCarga;

    public PickUp(String marca, String modelo, String estado, String cilindraje, String velocidadMaxima,
            TipoCombustible tipoDeCombustible, TipoTransmision tipoDeTransmision, int nPasajero, int nPuerta,
            boolean aireAcondicionado, boolean camaraReversa, int nBolsasAire, boolean aBS, boolean cuatrox4,
            String capacidadCajaCarga) {
        super(marca, modelo, estado, cilindraje, velocidadMaxima, tipoDeCombustible, tipoDeTransmision);
        this.nPasajero = nPasajero;
        this.nPuerta = nPuerta;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.nBolsasAire = nBolsasAire;
        ABS = aBS;
        this.cuatrox4 = cuatrox4;
        this.capacidadCajaCarga = capacidadCajaCarga;
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

    public boolean isCuatrox4() {
        return cuatrox4;
    }

    public void setCuatrox4(boolean cuatrox4) {
        this.cuatrox4 = cuatrox4;
    }

    public String getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(String capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String toString() {
        return "PickUp [nPasajero=" + nPasajero + ", nPuerta=" + nPuerta + ", aireAcondicionado=" + aireAcondicionado
                + ", camaraReversa=" + camaraReversa + ", nBolsasAire=" + nBolsasAire + ", ABS=" + ABS + ", cuatrox4="
                + cuatrox4 + ", capacidadCajaCarga=" + capacidadCajaCarga + "]";
    }

    @Override
    public void mostrarDetalles() {
        // TODO Auto-generated method stub
        
    }
    

}
