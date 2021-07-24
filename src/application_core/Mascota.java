package src.application_core;

public class Mascota {
    //Nombre de la mascota
    private String nombre;
    //Raza de la mascota
    private String raza;
    //Edad de la mascota
    private int edad;

    /**
     * constructor del objeto tipo mascota
     * @param nombre
     * @param raza
     * @param edad
     */
    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    /**
     * constructor vacío
     */
    public Mascota() {
    }

    /**
     * Obtiene el valor del nombre de la mascota
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre de la mascota
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la raza de la mascota
     * @return raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Asigna la raza de la mascota
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Obtiene la edad de la mascota
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Asigna la edad de la mascota
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
