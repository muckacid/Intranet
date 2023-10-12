/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author morag
 */
public class Estudiante {
    private String rut;
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    // antecedentes medicos
    private String telefono;
    private String email;
    private boolean matriculado;
    
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, LocalDate nacimiento, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.rut = rut;
        this.matriculado = false;
    }
    
    public Estudiante(String nombre, String apellido, LocalDate nacimiento, String rut, String telefono, String email, boolean matriculado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.rut = rut;
        this.telefono = telefono;
        this.email = email;
        this.matriculado = matriculado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public String getRut() {
        return rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", rut=" + rut + ", telefono=" + telefono + ", email=" + email + ", matriculado=" + matriculado + '}';
    }
    
}
