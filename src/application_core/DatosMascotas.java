package src.application_core;
import java.util.ArrayList;



public class DatosMascotas {

    private ArrayList<Mascota> mascotas;
   
    public DatosMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public DatosMascotas() {
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public  void registrarMascota(Mascota mascota){

    }

    public Mascota buscarMascotas(String nombre){
        return null;
    }

    
    
}
