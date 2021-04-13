
package persona;

import animales.Animal;
import static java.lang.Thread.sleep;
import manejadores.ManejadorGranjero;
import plantas.Planta;
import vehiculos.Barco;


public class Jugador {
    
    private String nombre;
    private String nickName;
    private int vida;
    private int oro;
    private int oroGenerado;
    private int oroAcumulado;
    private Animal[] animales;
    private Planta[] plantas;
    private Barco barco1;
    ManejadorGranjero manejadorGranjero;

    public Jugador(String nombre, String nickName, int vida, int oro, int oroGenerado, int oroAcumulado, Animal[] animales, Planta[] plantas, Barco barco1) {
        this.nombre = nombre;
        this.nickName = nickName;
        this.vida = vida;
        this.oro = oro;
        this.oroGenerado = oroGenerado;
        this.oroAcumulado = oroAcumulado;
        this.animales = animales;
        this.plantas = plantas;
        this.barco1 = barco1;
    }
    
    public Jugador(String nombre, String nickName, int vida, int oro){
        this.nombre = nombre;
        this.nickName = nickName;
        this.vida = vida;
        this.oro = oro;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getVida()  {

        return vida;
        
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getOroGenerado() {
        return oroGenerado;
    }

    public void setOroGenerado(int oroGenerado) {
        this.oroGenerado = oroGenerado;
    }

    public int getOroAcumulado() {
        return oroAcumulado;
    }

    public void setOroAcumulado(int oroAcumulado) {
        this.oroAcumulado = oroAcumulado;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public Planta[] getPlantas() {
        return plantas;
    }

    public void setPlantas(Planta[] plantas) {
        this.plantas = plantas;
    }

    public Barco getBarco1() {
        return barco1;
    }

    public void setBarco1(Barco barco1) {
        this.barco1 = barco1;
    }
    
    
    
    
    
    
    
}
