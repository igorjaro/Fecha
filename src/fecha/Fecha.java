/**
 * paquete
 */
package fecha;
/**
*@author Igor Jaroslavcev
*Clase Fecha. Crea una fecha. Con el método validaFecha() se 
*puede comprobar si el formato es valido. Atributos de la clase Fecha.
*int dia.
*int mes.
*int anio.
*/
public class Fecha {
    /**
     * Atributo dia, int(entero).
     */
    private int dia;
    /**
     * Atributo mes, int(entero).
     */
    private int mes;
    /**
     * Atributo anio, int(entero).
     */
    private int anio;
    /**
     * @return dia
     * Getter dia. Devuelve entero int.
     */
    public int getDia() {
        return dia;
    }
    /**
     * @param dia
     * Setter para el dia. Se pasa entero int.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * @return  mes
     * Getter mes. Devuelve entero int.
     */
    public int getMes() {
        return mes;
    }
    /**
     * @param mes 
     * Setter mes. Se pasa entero int.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * @return anio
     * Getter anio. Devuelve entero int.
     */
    public int getAnio() {
        return anio;
    }
    /**
     * @param anio 
     * Setter anio. Se pasa entero int.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @param dia entero.
     * @param mes entero.
     * @param anio entero.
     * Constructor Fecha(). Hay que pasar 3 parametros, 3 enteros, dia, mes, año.
     * Ejemplo: Fecha(1,2,1990);
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
}
    /** 
     * 
     * @return false o true
     * Método validaFecha() utiliza para comprobar si el 
     * formato de fecha es correcto.
     */
    public boolean validaFecha() {
        if (getDia() < 1 || getDia() > 31){
            return false;
        }
        if (getMes() < 1 || getMes() > 12){
            return false;
        }
    // Determinamos la cantidad de días del mes:
        int diasMes = 0;
        switch (getMes()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
            break;
            case 2: 
                verificarAnio();
            break;
        }
        return getDia() <= diasMes;
    }

    /**
     * @return void
     * Verificamos si el año es bisiesto
     */
    private void verificarAnio() {
        if ((getAnio() % 400 == 0) || ((getAnio() % 4 == 0) && (getAnio() % 100 != 0))){
            int diasMes;
            diasMes = 29;
        }
            else{
            int diasMes;
            diasMes = 28;
        }
    }
}