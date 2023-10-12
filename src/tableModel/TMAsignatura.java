/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Asignatura;
/**
 *
 * @author morag
 */
public class TMAsignatura extends AbstractTableModel {

    private List<Asignatura> lista;
    
    public TMAsignatura(List<Asignatura> lista){
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
        Asignatura asignatura = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0: 
                return asignatura.getCodigo();
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
