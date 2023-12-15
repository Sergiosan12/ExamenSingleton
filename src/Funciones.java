/**
 * Funciones utilizadas en el ejercicio
 * @author Sergio
 * @version v1.0
 */
public class Funciones {

    /**
     * Se crea el objeto dat de la clase Datos
     */
    Datos dat = Datos.getInstance();

    /**
     *
     * @param alias del jugador
     */
    public void pedirAlias(String alias){
    }

    /**
     *
     * @return genera un numero aleatorio entre 1 y 10
     */
    public int generarNumero(int min,int max){
        return dat.getNumeroAleatorio();
    }

    /**
     * Aparece una ventana donde se pide el numero del jugador
     */
    public void pedirNumero() {
    }

    /**
     *
     * @param numero introducido por el jugador para adivinar
     */
    public void instertarNumero(int numero){
    }

    /**
     *
     * @return la suma de las puntuaciones
     * Si el numero generado es igual al introducido suma 1, si no suma  0
     */
    public int sumarAciertos(int num1,int num2){
        if(num1==num2){
            return dat.getPuntuacion()+1;
        }
        return dat.getPuntuacion()+0;
    }

    /**
     * Calcula la suma final de los aciertos de las 10 rondas
     */

    public void calcularPuntuacionFinal(){
    }

    /**
     * Calcula el numero de fallos en total de las 10 rondas
     */
    public void calcularFallos(){

    }

    /**
     *
     * @return devuelve la puntuación record y el alias si la puntuacion es la mayor de todas las partidas jugadas
     */
    public Record guardarRecord(){
        return dat.getRecord();
    }
}
