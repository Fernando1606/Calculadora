package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class calculadora extends JFrame {
	private JPanel panel;
	private JLabel etiquetaimagen;
	private JLabel etiqueta;
	private JButton boton0;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton botonmas;
	private JButton botonmenos;
	private JButton botonmult;
	private JButton botonresul;
	private int n;
	private int m;
	private int r;
	
	public calculadora() {
		crearPanel();
		anadirBoton();
	//	anadirEtiqueta();
	}
	
	private void crearPanel() {

		this.setSize(500, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("CALCULATOR 2000");
		this.setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		panel.setBackground(new Color(2,123,100));
	}
	
	
	private void anadirBoton() {
		boton0 = new JButton("0");
		boton0.setBounds(16, 550, 216, 100);
		
		ActionListener oyente0 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("0");
			}
		};
		
		boton0.addActionListener(oyente0);
		panel.add(boton0);
		
		
		boton1 = new JButton("1");
		boton1.setBounds(16, 425, 100, 100);
		
		ActionListener oyente1 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("1");
			}
		};
		
		boton1.addActionListener(oyente1);
		panel.add(boton1);
		
		
		
		boton2 = new JButton("2");
		boton2.setBounds(132, 425, 100, 100);
		
		ActionListener oyente2 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("2");
			}
		};
		
		boton2.addActionListener(oyente2);
		panel.add(boton2);
		
		
		
		boton3 = new JButton("3");
		boton3.setBounds(248, 425, 100, 100);
		
		ActionListener oyente3 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("3");
			}
		};
		
		boton3.addActionListener(oyente3);
		panel.add(boton3);
		
		
		
		boton4 = new JButton("4");
		boton4.setBounds(16, 300, 100, 100);
		
		ActionListener oyente4 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("4");
			}
		};
		
		boton4.addActionListener(oyente4);
		panel.add(boton4);
		
		
		boton5 = new JButton("5");
		boton5.setBounds(132, 300, 100, 100);
		
		ActionListener oyente5 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("5");
			}
		};
		
		boton5.addActionListener(oyente5);
		panel.add(boton5);
		
		
		
		boton6 = new JButton("6");
		boton6.setBounds(248, 300, 100, 100);
		
		ActionListener oyente6 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("6");
			}
		};
		
		boton6.addActionListener(oyente6);
		panel.add(boton6);
		
		
		
		
		boton7 = new JButton("7");
		boton7.setBounds(16, 175, 100, 100);
		
		ActionListener oyente7 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("7");
			}
		};
		
		boton7.addActionListener(oyente7);
		panel.add(boton7);
		
		
		
		
		boton8 = new JButton("8");
		boton8.setBounds(132, 175, 100, 100);
		
		ActionListener oyente8 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("8");
			}
		};
		
		boton8.addActionListener(oyente8);
		panel.add(boton8);
		
		
		
		
		boton9 = new JButton("9");
		boton9.setBounds(248, 175, 100, 100);
		
		ActionListener oyente9 = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("9");
			}
		};
		
		boton9.addActionListener(oyente9);
		panel.add(boton9);
		
		
		
		
		botonmas = new JButton("+");
		botonmas.setBounds(364, 425, 100, 100);
		
		ActionListener oyentemas = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("+");
			}
		};
		
		botonmas.addActionListener(oyentemas);
		panel.add(botonmas);
		
		
		
		botonmenos = new JButton("-");
		botonmenos.setBounds(364, 300, 100, 100);
		
		ActionListener oyentemenos = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("-");
			}
		};
		
		botonmenos.addActionListener(oyentemenos);
		panel.add(botonmenos);
		
		
		
		botonmult = new JButton("x");
		botonmult.setBounds(364, 175, 100, 100);
		
		ActionListener oyentemult = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("x");
			}
		};
		
		botonmult.addActionListener(oyentemult);
		panel.add(botonmult);

		
		
		botonresul = new JButton("=");
		botonresul.setBounds(364, 550, 100, 100);
		
		ActionListener oyenteresul = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				n=1;
				etiqueta.setText("=");
			}
		};
		
		botonresul.addActionListener(oyenteresul);
		panel.add(botonresul);
		
	}
	
	private void anadirEtiqueta() {
		etiqueta = new JLabel();
		etiqueta.setSize(468, 100);
		etiqueta.setBackground(Color.WHITE);
		etiqueta.setOpaque(true);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		Font f = new Font("arial", Font.BOLD, 15);
		etiqueta.setFont(f);
		Point p = etiquetaimagen.getLocation();
		etiqueta.setLocation(16, 50);
		panel.add(etiqueta);
	}
}