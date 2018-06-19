/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import dao.FiltroDao;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Filtro;

/**
 *
 * @author LN710Q
 */
public class Consulta extends JFrame {
    public JLabel lblCarnet, lblNombre, lblApellidos, lblEdad,lblUniversidad,lblEstado;

    public JTextField carnet,nombre,apellidos,edad;
    public JComboBox universidad;

    ButtonGroup estado = new ButtonGroup();
    public JRadioButton no;
    public JRadioButton si;
    public JTable resultados;

    public JPanel table;

    public JButton buscar, eliminar, insertar, limpiar, actualizar;

    private static final int ANCHOC = 130, ALTOC = 30;

    DefaultTableModel tm;
    
    
    public Consulta() {
        super("Inscripciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        llenarTabla();
        Container container = getContentPane();
        container.add(lblCarnet);
        container.add(lblNombre);
        container.add(lblApellidos);
        container.add(lblEdad);
        container.add(lblUniversidad);
        container.add(lblEstado);
        container.add(carnet);
        container.add(nombre);
        container.add(apellidos);
        container.add(universidad);
        container.add(si);
        container.add(no);
        container.add(buscar);
        container.add(insertar);
        container.add(actualizar);
        container.add(eliminar);
        container.add(limpiar);
        container.add(table);
        setSize(600, 600);
        //eventos();

    }
    
    private void agregarLabels() {
        lblCarnet = new JLabel("Carnet");
        lblNombre = new JLabel("Nombre");
        lblApellidos = new JLabel("Apellidos");
        lblEdad = new JLabel("Edad");
        lblUniversidad = new JLabel("Universidad");
        lblEstado = new JLabel("Estado");
        lblCarnet.setBounds(10, 10, ANCHOC, ALTOC);
        lblNombre.setBounds(10, 60, ANCHOC, ALTOC);
        lblApellidos.setBounds(300, 60, ANCHOC, ALTOC);
        lblEdad.setBounds(250, 100, ANCHOC, ALTOC);
        lblUniversidad.setBounds(10, 100, ANCHOC, ALTOC);
        lblEstado.setBounds(10, 140, ANCHOC, ALTOC);
    }
    
    private void formulario() {
        carnet = new JTextField();
        nombre = new JTextField();
        apellidos = new JTextField();
        edad = new JTextField();
        universidad = new JComboBox();
        si = new JRadioButton("si", true);
        no = new JRadioButton("no");
        resultados = new JTable();
        buscar = new JButton("Buscar");
        insertar = new JButton("Insertar");
        eliminar = new JButton("Eliminar");
        actualizar = new JButton("Actualizar");
        limpiar = new JButton("Limpiar");

        table = new JPanel();

        universidad.addItem("UCA");
        universidad.addItem("UDB");
        universidad.addItem("UFG");
        universidad.addItem("UGB");

        estado = new ButtonGroup();
        estado.add(si);
        estado.add(no);

        
        carnet.setBounds(140, 10, ANCHOC, ALTOC);
        nombre.setBounds(150, 60, ANCHOC, ALTOC);
        apellidos.setBounds(380, 60, ANCHOC, ALTOC);
        universidad.setBounds(100, 100, ANCHOC, ALTOC);
        edad.setBounds(300,60, ANCHOC, ALTOC);
        si.setBounds(140, 140, 50, ALTOC);
        no.setBounds(210, 140, 50, ALTOC);

        buscar.setBounds(300, 10, ANCHOC, ALTOC);
        insertar.setBounds(10, 210, ANCHOC, ALTOC);
        actualizar.setBounds(150, 210, ANCHOC, ALTOC);
        eliminar.setBounds(300, 210, ANCHOC, ALTOC);
        limpiar.setBounds(450, 210, ANCHOC, ALTOC);

        resultados = new JTable();
        table.setBounds(10, 250, 500, 200);
        table.add(new JScrollPane(resultados));

    }
    
    private void llenarTabla() {
        tm = new DefaultTableModel() {
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    default:
                        return Boolean.class;
                }
            }
        };

        tm.addColumn("Carnet");
        tm.addColumn("Nombres");
        tm.addColumn("Apellidos");
        tm.addColumn("Universidad");
        tm.addColumn("Estado");

        FiltroDao fd = new FiltroDao();
        ArrayList<Filtro> filtros = fd.readAll();

        for (Filtro fi : filtros) {
            tm.addRow(new Object[]{fi.getCarnet(), fi.getNombre(), fi.getApellidos(), fi.getEdad(),fi.getUniversidad(),fi.getEstado()});
        }

        resultados.setModel(tm);

    }

    
    
}



