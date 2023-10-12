/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Estudiante;

/**
 *
 * @author morag
 */
public class DataEstudiante {
    private List<Estudiante> listaDeEstudiantes;

    public DataEstudiante() {
        this.listaDeEstudiantes = new ArrayList<>();
        iniciarLista();
    }
    
    public void nuevo(Estudiante estudiante){
        this.listaDeEstudiantes.add(estudiante);
    }

    public List<Estudiante> getLista(){
        return this.listaDeEstudiantes;
    }
    
    public void actualizar(int index, Estudiante estudiante) {
        this.listaDeEstudiantes.set(index, estudiante);
    }
    
    public void iniciarLista(){
        this.listaDeEstudiantes.add(new Estudiante("Maximiliano", "Moraga", LocalDate.parse("1994-01-25"), "18646384-6", "56990830923", "max@gmail.com", true));
        this.listaDeEstudiantes.add(new Estudiante("Pancho", "Ulloa", LocalDate.parse("2003-02-12"), "99999-6", "9999999", "pancho@gmail.com", true));
    }
    
}
