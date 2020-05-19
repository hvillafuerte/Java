//Creacion de procesador de texto muy basico

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;

public class Procesador {

	public static void main(String[] args) {

		MenuProcesador mimarco = new MenuProcesador();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

// cremos marco
class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		
		setBounds(400,200,550,400);
		LaminaProcesador milamina = new LaminaProcesador();
		add(milamina);
		setVisible(true);
	}
	
}

// lamina
class LaminaProcesador extends JPanel {
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		//creamos lamina para almacenar el menu
		JPanel laminamenu=new JPanel();
		
		
		//creamos barra de menu
		JMenuBar mibarra = new JMenuBar();
		
		//------------------------------------------------------------
		//creamos los botones de la barra de menu.
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamano");
		//-------------------------------------------------------------
		//menu para elegir la fuente.
		
		JMenuItem arial = new JMenuItem("Arial");
		JMenuItem courier = new JMenuItem("Courier");
		JMenuItem verdana = new JMenuItem("Verdana");
		
		//indicamos a donde van estos elementos
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		//-------------------------------------------------------------
		//hacemos lo mismo con los submenus de cada boton
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		
		
		estilo.add(negrita);
		estilo.add(cursiva);
		
		//--------------------------------------------------------------
		
		JMenuItem tam12 = new JMenuItem("12");
		JMenuItem tam16 = new JMenuItem("16");
		JMenuItem tam20 = new JMenuItem("20");
		JMenuItem tam24 = new JMenuItem("24");
		
		tamano.add(tam12);
		tamano.add(tam16);
		tamano.add(tam20);
		tamano.add(tam24);
		
		
		//agregamos los botones en la lamina o barra de menu.
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);
		
		//agregamos la barra a la lamina principal
		laminamenu.add(mibarra); 
		add(laminamenu,BorderLayout.NORTH);
		
		//agregamos el area de texto con JTextPane
		
		JTextPane miareaTexto = new JTextPane();
		add(miareaTexto,BorderLayout.CENTER);
		
		
		//-------------------------------------------------------------
		
	}
} 