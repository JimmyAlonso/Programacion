package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int nPasajero;
    private int nPuerta;
    private int nBolsasAire;
    private int nHP;
    private String tiempo100km;

    public Deportivo(String marca, String modelo, String estado, String cilindraje, String velocidadMaxima,
            TipoCombustible tipoDeCombustible, TipoTransmision tipoDeTransmision, int nPasajero, int nPuerta,
            int nBolsasAire, int nHP, String tiempo100km) {
        super(marca, modelo, estado, cilindraje, velocidadMaxima, tipoDeCombustible, tipoDeTransmision);
        this.nPasajero = nPasajero;
        this.nPuerta = nPuerta;
        this.nBolsasAire = nBolsasAire;
        this.nHP = nHP;
        this.tiempo100km = tiempo100km;
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

    public int getnBolsasAire() {
        return nBolsasAire;
    }

    public void setnBolsasAire(int nBolsasAire) {
        this.nBolsasAire = nBolsasAire;
    }

    public int getnHP() {
        return nHP;
    }

    public void setnHP(int nHP) {
        this.nHP = nHP;
    }

    public String getTiempo100km() {
        return tiempo100km;
    }

    public void setTiempo100km(String tiempo100km) {
        this.tiempo100km = tiempo100km;
    }

    @Override
    public String toString() {
        return "Deportivo [nPasajero=" + nPasajero + ", nPuerta=" + nPuerta + ", nBolsasAire=" + nBolsasAire + ", nHP="
                + nHP + ", tiempo100km=" + tiempo100km + "]";
    }

}
