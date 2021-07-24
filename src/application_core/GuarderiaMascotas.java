package src.application_core;

public class GuarderiaMascotas{
    public static void main (String[] args){
        //Se crea la clase datos Mascota.
        DatosMascotas datosMascotas=new DatosMascotas();
        //Se crea el objeto de tipo mnascota con sus respectivos datos.
        Mascota mascota1= new Mascota("Chaca", "Pincher", 88);
        //Se añade la mascota creada a la lista de mascotas.
        datosMascotas.registrarMascota(mascota1);
        //Print del nombre de la primera posicion del array donde se encuentra la mascota guardada en memoria.
        System.out.print(datosMascotas.getMascotas().get(0).getNombre());
    }
}