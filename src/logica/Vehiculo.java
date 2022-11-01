
package logica;

import java.io.Serializable;

public class Vehiculo implements Serializable{
  private String marca;
  private String matricula;
  private int modelo;
  private int capacidad;
  private int kilometraje;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String matricula, int modelo, int capacidad, int kilometraje) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.kilometraje = kilometraje;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + ", capacidad=" + capacidad + ", kilometraje=" + kilometraje + '}';
    }



    
}
