package logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Iván
 */
public class GestorVehiculo implements Global, Serializable {

    public boolean existe(String matriculaVehi) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matriculaVehi)) {
                return true;
            }
        }
        return false;
    }
    //Avisa la existencia si agunas de las categorias ya existe.

    public void guardar(Vehiculo vehiculo) {
        if (!existe(vehiculo.getMatricula())) {
            listaVehiculos.add(vehiculo);
        }
    }
    //guarda una vehiculo dentro del contenedor 

    public void editar(Vehiculo vehiculo) {
        if (existe(vehiculo.getMatricula())) {
            int pos = obtenerPosicionDe(vehiculo.getMatricula());
            listaVehiculos.set(pos, vehiculo);
        }
    }
    //elimina alguna vehiculo ya existente y la cambio por una nueva en la misma posicion.        

    public int obtenerPosicionDe(String MatriculaVehi) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(MatriculaVehi)) {
                return listaVehiculos.indexOf(vehiculo);
            }
        }
        return -1;
    }

    public DefaultTableModel obtenerModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"MATRICULA", "MARCA", "MODELO", "CAPACIDAD", "KILOMETRAJE"}
        );
        String fila[] = new String[5];
        for (Vehiculo vehiculo : listaVehiculos) {
            fila[0] = vehiculo.getMatricula().toUpperCase();
            fila[1] = vehiculo.getMarca().toUpperCase();
            fila[2] = "" + vehiculo.getModelo();
            fila[3] = "" + vehiculo.getCapacidad();
            fila[4] = "" + vehiculo.getKilometraje();

            modelo.addRow(fila);
        }
        return modelo;
    }

    public DefaultTableModel obtenerModeloTablaMatricula(String matricula) {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"MATRICULA", "MARCA", "MODELO", "CAPACIDAD", "KILOMETRAJE"}
        );
        String fila[] = new String[5];
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMatricula().equals(matricula.toUpperCase())) {
                fila[0] = vehiculo.getMatricula().toUpperCase();
                fila[1] = vehiculo.getMarca().toUpperCase();
                fila[2] = "" + vehiculo.getModelo();
                fila[3] = "" + vehiculo.getCapacidad();
                fila[4] = "" + vehiculo.getKilometraje();

                modelo.addRow(fila);
            }
        }
        return modelo;
    }
    
        public DefaultTableModel obtenerModeloTablaMarca(String marca) {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"MATRICULA", "MARCA", "MODELO", "CAPACIDAD", "KILOMETRAJE"}
        );
        String fila[] = new String[5];
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getMarca().equals(marca.toUpperCase())) {
                fila[0] = vehiculo.getMatricula().toUpperCase();
                fila[1] = vehiculo.getMarca().toUpperCase();
                fila[2] = "" + vehiculo.getModelo();
                fila[3] = "" + vehiculo.getCapacidad();
                fila[4] = "" + vehiculo.getKilometraje();

                modelo.addRow(fila);
            }
        }
        return modelo;
    }
        
    public DefaultTableModel obtenerModeloTablaModelo(int model) {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"MATRICULA", "MARCA", "MODELO", "CAPACIDAD", "KILOMETRAJE"}
        );
        String fila[] = new String[5];
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getModelo() == model ) {
                fila[0] = vehiculo.getMatricula().toUpperCase();
                fila[1] = vehiculo.getMarca().toUpperCase();
                fila[2] = "" + vehiculo.getModelo();
                fila[3] = "" + vehiculo.getCapacidad();
                fila[4] = "" + vehiculo.getKilometraje();

                modelo.addRow(fila);
            }
        }
        return modelo;
    }
    
    public DefaultTableModel obtenerModeloTablaCapacidad(int capacidad) {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"MATRICULA", "MARCA", "MODELO", "CAPACIDAD", "KILOMETRAJE"}
        );
        String fila[] = new String[5];
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getCapacidad() == capacidad ) {
                fila[0] = vehiculo.getMatricula().toUpperCase();
                fila[1] = vehiculo.getMarca().toUpperCase();
                fila[2] = "" + vehiculo.getModelo();
                fila[3] = "" + vehiculo.getCapacidad();
                fila[4] = "" + vehiculo.getKilometraje();

                modelo.addRow(fila);
            }
        }
        return modelo;
    }
    
    
    public DefaultTableModel obtenerModeloTablaKilometraje(int km) {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"MATRICULA", "MARCA", "MODELO", "CAPACIDAD", "KILOMETRAJE"}
        );
        String fila[] = new String[5];
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getKilometraje() <= km ) {
                fila[0] = vehiculo.getMatricula().toUpperCase();
                fila[1] = vehiculo.getMarca().toUpperCase();
                fila[2] = "" + vehiculo.getModelo();
                fila[3] = "" + vehiculo.getCapacidad();
                fila[4] = "" + vehiculo.getKilometraje();

                modelo.addRow(fila);
            }
        }
        return modelo;
    }

    public void eliminar(String matricula) {
        int pos = obtenerPosicionDe(matricula);
        listaVehiculos.remove(pos);
    }

    @Override
    public void guardarEnArchivo() {
        String archivo = "vehiculos.txt";
        if (!listaVehiculos.isEmpty()) {
            try {
                ObjectOutputStream ficheroSalida = new ObjectOutputStream(
                        new FileOutputStream(new File(archivo)));
                ficheroSalida.writeObject(listaVehiculos);
                ficheroSalida.flush();
                ficheroSalida.close();
                System.out.println("Datos guardados correctamente en " + archivo + ".");
            } catch (FileNotFoundException fnfe) {
                System.out.println("Error: El fichero " + archivo + " no existe. ");
            } catch (IOException ioe) {
                System.out.println("Error: Falló la escritura en el fichero" + archivo + ". ");
            }
        } else {
            System.out.println("No hay datos que guardar. La lista está vacía. ");
        }
    }

    @Override
    public void recuperarDeArchivo() {
        try {
            File fichero = new File("vehiculos.txt");
            if (fichero.exists()) {
                ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
                ArrayList<Vehiculo> temporal = (ArrayList) ficheroEntrada.readObject();
                listaVehiculos.clear();
                listaVehiculos.addAll(temporal);
                ficheroEntrada.close();
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }

    }

    public void cargarReporte() {
        String logotipo = "/Reporte/logo.png";
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
//direccion del archivo JASPER
            URL in = this.getClass().getResource("/Reporte/rptVehiculo.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
//Se crea un objeto HashMap
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", this.getClass().getResourceAsStream(logotipo));
//==================================================================
            VehiculoDataSource datasource = new VehiculoDataSource();
            for (Vehiculo vehiculo : listaVehiculos) {
                datasource.addVehiculo(vehiculo);
            }
//==================================================================
            parametros.put("total", datasource.getTotal());
            reporte_view = JasperFillManager.fillReport(reporte, parametros, datasource);
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
        } catch (NullPointerException ex) {
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
