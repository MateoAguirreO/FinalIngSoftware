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
        this.mascotas.add(mascota);
    }

    public Mascota buscarMascota(String nombre){
        for(int i=0; i<this.mascotas.size(); i++){
            if(this.mascotas.get(i).getNombre().equals(nombre)){
                return this.mascotas.get(i);
            }
        }
        return null;
    }

    
    
}
