package gui;

import model.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAgregarLibro extends Ventana{

    private JLabel textoMenu;
    private JButton botonAgregar;
    private JLabel textoTitulo;
    private JLabel textoAutor;
    private JLabel textoFecha;
    private JLabel textoGenero;
    private JTextField entradaTextoTitulo;
    private JTextField entradaTextoAutor;
    private JTextField entradaTextoFecha;
    private JTextField entradaTextoGenero;
    private JButton botonVolver;

    public VentanaAgregarLibro() {
        super("Agregar Libro",600,600);
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarMensajeMenu();
        generarTextoTitulo();
        generarEntradaDeTextoTitulo();
        generarTextoAutor();
        generarEntradaDeTextoAutor();
        generarTextoFecha();
        generarEntradaDeTextoFecha();
        generarTextoGenero();
        generarEntradaDeTextoGenero();
        generarBotonAgregarLibro();
        generarBotonVolver();
    }
    private void generarMensajeMenu() {
        String textoBienvenida = "Biblioteca - Agregar Libro";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 50, 30, 500, 30);
    }
    //Título
    private void generarTextoTitulo() {
        String textoTitulo = "Título:";
        super.generarJLabel(this.textoTitulo, textoTitulo, 50, 80, 500, 30);
    }
    private void generarEntradaDeTextoTitulo() {

        this.entradaTextoTitulo = super.generarJTextField(50, 115, 500, 20);
        this.add(this.entradaTextoTitulo);
        this.entradaTextoTitulo.addActionListener(this);

    }
    //Autor
    private void generarTextoAutor() {
        String textoAutor = "Autor:";
        super.generarJLabel(this.textoAutor, textoAutor, 50, 140, 500, 30);
    }
    private void generarEntradaDeTextoAutor() {

        this.entradaTextoAutor = super.generarJTextField(50, 175, 500, 20);
        this.add(this.entradaTextoAutor);
        this.entradaTextoAutor.addActionListener(this);

    }
    //Fecha
    private void generarTextoFecha() {
        String textoFecha = "Fecha de Publicación:";
        super.generarJLabel(this.textoFecha, textoFecha, 50, 200, 500, 30);
    }
    private void generarEntradaDeTextoFecha() {

        this.entradaTextoFecha = super.generarJTextField(50, 235, 500, 20);
        this.add(this.entradaTextoFecha);
        this.entradaTextoFecha.addActionListener(this);

    }
    //Género
    private void generarTextoGenero() {
        String textoGenero = "Género:";
        super.generarJLabel(this.textoGenero, textoGenero, 50, 260, 500, 30);
    }
    private void generarEntradaDeTextoGenero() {

        this.entradaTextoGenero = super.generarJTextField(50, 295, 500, 20);
        this.add(this.entradaTextoGenero);
        this.entradaTextoGenero.addActionListener(this);

    }
    //Botones
    private void generarBotonAgregarLibro() {
        String textoBoton = "Agregar Libro";
        this.botonAgregar = super.generarBoton(textoBoton, 225, 350, 150, 30);
        this.add(this.botonAgregar);
        this.botonAgregar.addActionListener(this);
    }
    private void generarBotonVolver() {
        String textoBoton = "Volver";
        this.botonVolver = super.generarBoton(textoBoton, 225, 390, 150, 40);
        this.add(this.botonVolver);
        this.botonVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.entradaTextoTitulo) {

        }
        if (e.getSource() == this.entradaTextoAutor) {

        }
        if (e.getSource() == this.entradaTextoFecha) {

        }
        if (e.getSource() == this.entradaTextoGenero) {

        }
        if (e.getSource() == this.botonAgregar) {

        }

        if(e.getSource() == this.botonVolver){
            new VentanaBienvenida();
            this.dispose();
        }
    }

}

