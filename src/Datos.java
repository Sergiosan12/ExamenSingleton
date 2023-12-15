public class Datos {
    /**
     * Numero generado para adivinar
     */
    private int numeroAleatorio;
    /**
     * Numero introducido por el usuario
     */
    private int numeroIntroducido;
    /**
     * Intentos máximos
     */
    private int intentosMax;
    /**
     * Numero de aciertos en una partida
     */
    private int puntuacion;

    /**
     * Nombre del jugador
     */
    private String alias;
    /**
     * Rondas en cada partida
     */
    private int rondasPartida;
    /**
     * Numero de fallos en una partida
     */
    private int fallos;
    /**
     * Record
     */
    private Record record;

    /**
     *Se crea el constructor privado
     */

    private static Datos instance = null;
    private Datos(){

    }
    public static Datos getInstance(){
        if(instance==null){
            instance=new Datos();
        }
        return instance;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getNumeroIntroducido() {
        return numeroIntroducido;
    }

    public void setNumeroIntroducido(int numeroIntroducido) {
        this.numeroIntroducido = numeroIntroducido;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getRondasPartida() {
        return rondasPartida;
    }

    public void setRondasPartida(int rondasPartida) {
        this.rondasPartida = rondasPartida;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public static void setInstance(Datos instance) {
        Datos.instance = instance;
    }

    public Datos(int numeroAleatorio, int numeroIntroducido, int intentosMax, int puntuacion, String alias, int rondasPartida, int fallos, Record record) {
        this.numeroAleatorio = numeroAleatorio;
        this.numeroIntroducido = numeroIntroducido;
        this.intentosMax = intentosMax;
        this.puntuacion = puntuacion;
        this.alias = alias;
        this.rondasPartida = rondasPartida;
        this.fallos = fallos;
        this.record = record;
    }
}
