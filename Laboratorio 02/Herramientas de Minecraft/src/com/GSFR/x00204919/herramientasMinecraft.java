package com.GSFR.x00204919;

public class herramientasMinecraft {

    private String nombre;
    private String material;
    private double durabilidad;
    private double daño;
    private String encantamiento;


    public herramientasMinecraft(String nombre, String material, double durabilidad, double daño, String encantamientos) {
        this.nombre = nombre;
        this.material = material;
        this.durabilidad = durabilidad;
        this.daño = daño;
        this.encantamiento = encantamientos;
    }

    public void Picar(Boolean demoler, double bloque){
        if (demoler && bloque >= 1){
             durabilidad -= bloque/5;

        }
    }

    public void Atacar(Boolean ataque, double cantAtaques){

        if (ataque && cantAtaques >= 1){
            durabilidad -= cantAtaques/5;
        }

    }

    @Override
    public String toString() {
        return "herramientasMinecraft{" +
                "nombre:'" + nombre + '\'' +
                ", material:'" + material + '\'' +
                ", durabilidad:" + durabilidad +
                ", daño:" + daño +
                ", encantamiento:'" + encantamiento + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public String getEncantamiento() {
        return encantamiento;
    }

    public void setEncantamiento(String encantamiento) {
        this.encantamiento = encantamiento;
    }
}
