/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.jaxrs.students;

/**
 *
 * @author Alonso PC
 */
public class Student {
    private String id; 
    private String nombres; 
    private String apellidos; 
    private String cursoActual; 
    private double notaActual; 

    public Student(String id, String nombres, String apellidos, String cursoActual, double notaActual) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cursoActual = cursoActual;
        this.notaActual = notaActual;
    }
    
    //Atributos de esta clase:    
    public String getIdEstudiante() {
        return id;
    }

    public void setIdEstudiante(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCursoActual() {
        return cursoActual;
    }

    public void setCursoActual(String cursoActual) {
        this.cursoActual = cursoActual;
    }

    public double getNotaActual() {
        return notaActual;
    }

    public void setNotaActual(double notaActual) {
        this.notaActual = notaActual;
    }

    @Override
    public String toString() {
        return "Estudiante [id= " + id + ", Nombres= " + nombres + ", Apellidos= " + apellidos + ", CursoActual= " + cursoActual + ", NotaActual= " + notaActual + "]" ;
    }  
}
