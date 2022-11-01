/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logica;

import java.util.ArrayList;

public interface Global {

    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    public void guardarEnArchivo();

    public void recuperarDeArchivo();
}
