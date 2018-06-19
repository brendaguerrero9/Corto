/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class Filtro {
    private int id;
    private String carnet;
    private String nombre;
    private String apellidos;
    private int edad;
    private String universidad;
    private boolean estado;

    public Filtro() {}
    
    public Filtro(int id, String carnet, String nombre, String apellidos, int edad, String universidad, boolean estado) {
        this.id = id;
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.universidad = universidad;
        this.estado = estado;
    }

    public Filtro(String carnet, String nombre, String apellidos, int edad, String universidad, boolean estado) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.universidad = universidad;
        this.estado = estado;
    }

    public Filtro(String nombre, String apellidos, int edad, String universidad, boolean estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.universidad = universidad;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
}
