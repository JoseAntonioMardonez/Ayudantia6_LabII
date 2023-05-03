package gui;

import model.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaBienvenida extends Ventana{

    private JLabel textoMenu;
    private JButton botonAgregar;
    private JButton botonEliminar;
    private JButton botonBuscar;
    private JButton botonPrestar;
    private JButton botonDevolver;
    private JButton botonSalida;

    public VentanaBienvenida() {
        super("Biblioteca",600,600);
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarMensajeMenu();
        generarBotonAgregarLibro();
        generarBotonEliminarLibro();
        generarBotonBuscarLibro();
        generarBotonPrestarLibro();
        generarBotonDevolverLibro();
        generarBotonSalir();
    }
    private void generarMensajeMenu() {
        String textoBienvenida = "Biblioteca";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 50, 30, 500, 30);
    }
    private void generarBotonAgregarLibro() {
        String textoBoton = "Agregar Libro";
        this.botonAgregar = super.generarBoton(textoBoton, 225, 90, 150, 30);
        this.add(this.botonAgregar);
        this.botonAgregar.addActionListener(this);
    }
    private void generarBotonEliminarLibro() {
        String textoBoton = "Eliminar Libro";
        this.botonEliminar = super.generarBoton(textoBoton, 225, 150, 150, 30);
        this.add(this.botonEliminar);
        this.botonEliminar.addActionListener(this);

    }
    private void generarBotonBuscarLibro() {
        String textoBoton = "Buscar Libro";
        this.botonBuscar = super.generarBoton(textoBoton, 225, 210, 150, 30);
        this.add(this.botonBuscar);
        this.botonBuscar.addActionListener(this);
    }
    private void generarBotonPrestarLibro() {
        String textoBoton = "Prestar Libro";
        this.botonPrestar = super.generarBoton(textoBoton, 225, 270, 150, 30);
        this.add(this.botonPrestar);
        this.botonPrestar.addActionListener(this);
    }

    private void generarBotonDevolverLibro() {
        String textoBoton = "Devolver Libro";
        this.botonDevolver = super.generarBoton(textoBoton, 225, 330, 150, 30);
        this.add(this.botonDevolver);
        this.botonDevolver.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 225, 390, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregar) {
            new VentanaAgregarLibro();
        }
        if (e.getSource() == this.botonEliminar) {

        }
        if (e.getSource() == this.botonBuscar) {

        }
        if (e.getSource() == this.botonPrestar) {

        }
        if (e.getSource() == this.botonDevolver) {

        }
        if(e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }
    }

}
