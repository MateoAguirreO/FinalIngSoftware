package src.application_core;
import java.util.ArrayList;



public class DatosMascotas {

    /**
     * Lista de objetos tipo mascotas 
     */
    private ArrayList<Mascota> mascotas;
   
    /**
     * Constructor con parametros
     * @param mascotas
     */
    public DatosMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * @return la lista de mascotas
     */
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    /**
     * Constructor el cual crea una lista vacía de tipo mascotas
     */
    public DatosMascotas() {
        this.mascotas= new ArrayList<Mascota>();
    }

    /**
     * Asigna a la lista de mascotas una lista que llega por parametro
     * @param mascotas
     */
    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * Añade a el objeto tipo mascota que le llega por parametro a la lista
     * @param mascota
     */
    public  void registrarMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }

    /**
     * Busca si la mascota se encuentra en la lista de acuerdo a su nombre
     * @param nombre
     * @return en caso de que se encuentre retorna el objeto de tipo mascota.
     *         si no se encuentra retorna null.
     */
    public Mascota buscarMascota(String nombre){
        for(int i=0; i<this.mascotas.size(); i++){
            if(this.mascotas.get(i).getNombre().equals(nombre)){
                return this.mascotas.get(i);
            }
        }
        return null;
    }

    
    
}
