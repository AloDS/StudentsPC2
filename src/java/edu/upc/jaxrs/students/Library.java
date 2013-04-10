/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.jaxrs.students;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.logging.Logger;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author Alonso PC
 */

// No se va a trabajar con XML sino JSon \\
@Path("/Library")
//Consumir y producir solo JSON:
@Consumes({"application/json"})
@Produces({"application/json"})

public class Library {
    //Con esta parte se trabaja con un arreglo de estudiantes y  por el momento no con una BDD
    private static Logger log = Logger.getLogger(Library.class.getName());

    private static Map<String, Student> students = new LinkedHashMap<String, Student>();
    static {
        Student[] studentarr = new Student[]{
            new Student("0001", "Alonso", "Da Silva", "DSD", 18.0),
            new Student("0002", "Jose", "Fernandez", "DSD", 15.5),
            new Student("0003", "Carlos", "Gonzales", "DSD", 17.0),
            new Student("0004", "Pedro", "Valdivia", "DSD", 8.0),
            new Student("0005", "Mary", "Salas", "DSD", 13.0),
            new Student("0006", "Karen", "Sanchez", "JAVAWEB", 15.0),
            new Student("0007", "Jorge", "Winder", "JAVAWEB", 18.5)
        };
        for (Student student : studentarr) {
            students.put(student.getIdEstudiante(), student);
        }
    }

    // Consultar todos los estudiantes y devuelve la colección de estudiantes
    @GET
    @Path("/students")
    public Collection<Student> getStudents(){
        Collection<Student> result = students.values();
        log.info("getStudents:" + result);
        return result;
    }

    // Consultar por ID de los estudiantes y devuelve el estudiante
    @GET
    @Path("/student/{id}")
    public Student getStudent(@PathParam("id") String id){
        Student student = students.get(id);
        log.info("getStudent:" + student);
        return student;
    }

    // Aquí hay parámetros como por ejemplo "id" que se reemplaza en PathParam("id") para que pueda hacer la consulta
    // Crear estudiantes 
    @POST
    @Path("/student")
    public Student addStudent(String id, String nombres, String apellidos, String cursoActual, double notaActual ){
        Student student = new Student(id, nombres, apellidos, cursoActual, notaActual);
        log.info("addStudent:" + student);
        students.put(id, student);
        return student;
    }

    // Modificar por ID los estudiantes 
    @PUT
    @Path("/student/{id}")
    public Student updateStudent(@PathParam("id") String id, String nombres, String apellidos, String cursoActual, double notaActual ){
        Student student = students.get(id);
        if (student != null) {
            student.setIdEstudiante(id);
            student.setNombres(nombres);
            student.setApellidos(apellidos);
            student.setCursoActual(cursoActual);
            student.setNotaActual(notaActual);
        }
        log.info("updateStudent:" + student);
        return student;
    }

    // Eliminar por ID los estudiantes 
    @DELETE
    @Path("/student/{id}")
    public Student removeStudent(@PathParam("id") String id){
        Student student = students.remove(id);
        log.info("removeStudent:" + student);
        return student;
    }
    
}
