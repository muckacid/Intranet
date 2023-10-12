/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Estudiante;

/**
 *
 * @author morag
 */
public class TMEstudiante extends AbstractTableModel {

    private List<Estudiante> lista;
    
    public TMEstudiante(List<Estudiante> lista){
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estudiante estudiante = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0: 
                return estudiante.getRut();
            case 1:
                return estudiante.getNombre();
            case 2:
                return estudiante.getApellido();
            case 3:
                return estudiante.getNacimiento();
            case 4:
                return "$"+estudiante.getEmail();
            case 5:
                return estudiante.getTelefono();
            default:
                return "";
        }
    }    
        
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: 
                return "RUT";
            case 1:
                return "Nombre";
            case 2:
                return "Apellido";
            case 3:
                return "Nacimiento";
            case 4:
                return "Email";
            default:
                return "Telefono";
        }
    }
    
}
