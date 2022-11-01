/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import static logica.Global.listaVehiculos;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Usuario
 */
public class VehiculoDataSource implements JRDataSource {

    private ArrayList<Vehiculo> lista = new ArrayList<>();
    private int indice = -1;

    @Override
    public boolean next() throws JRException {
        return ++indice < lista.size();
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {
        Object valor = null;
        switch (jrField.getName()) {
            case "matricula":
                valor = lista.get(indice).getMatricula();
                break;
            case "marca":
                valor = lista.get(indice).getMarca();
                break;
            case "modelo":
                valor = lista.get(indice).getModelo();
                break;
            case "capacidad":
                valor = lista.get(indice).getCapacidad();
                break;
            case "kilometraje":
                valor = lista.get(indice).getKilometraje();
                break;
        }
        return valor;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        this.lista.add(vehiculo);
    }

    public int getTotal() {
        return lista.size();
    }
}
