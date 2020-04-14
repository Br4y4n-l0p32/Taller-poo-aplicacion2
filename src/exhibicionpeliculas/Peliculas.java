package exhibicionpeliculas;

import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Peliculas extends JFrame implements ActionListener {
    private JLabel label1;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10, bCerrar;
    private JPanel panel1;
    private JScrollPane pane1;
    
 public Peliculas(){
   setLayout(null);
   label1 = new JLabel("Peliculas");
   label1.setBounds(10, 20, 300, 30);
   add(label1);
   
   boton1 = new JButton("Fast & Furious 8");
   boton1.setBounds(10, 60, 135, 30);
   add(boton1);
   boton1.addActionListener(this);
   boton2 = new JButton("Shooter");
   boton2.setBounds(10, 100, 135, 30);
   add(boton2);
   boton2.addActionListener(this);
   boton3 = new JButton("Sonic: La pelicula");
   boton3.setBounds(10, 140, 135, 30);
   add(boton3);
   boton3.addActionListener(this);
   boton4 = new JButton("La mala noche");
   boton4.setBounds(10, 180, 135, 30);
   add(boton4);
   boton4.addActionListener(this);
   boton5 = new JButton("Underwater");
   boton5.setBounds(10, 220, 135, 30);
   add(boton5);
   boton5.addActionListener(this);
   boton6 = new JButton("The boy: La maldicion");
   boton6.setBounds(10, 260, 135, 30);
   add(boton6);
   boton6.addActionListener(this);
   boton7 = new JButton("Bad boys para siempre");
   boton7.setBounds(10, 300, 135, 30);
   add(boton7);
   boton7.addActionListener(this);
   boton8 = new JButton("Trolls 2 gira mundial");
   boton8.setBounds(10, 340, 135, 30);
   add(boton8);
   boton8.addActionListener(this);
   boton9 = new JButton("La liga de los 5");
   boton9.setBounds(10, 380, 135, 30);
   add(boton9);
   boton9.addActionListener(this);
   boton10 = new JButton("Gretel and Hansel");
   boton10.setBounds(10, 420, 135, 30);
   add(boton10);
   boton10.addActionListener(this);
   bCerrar = new JButton("Cerrar");
   bCerrar.setBounds(10, 500, 100, 30);
   add(bCerrar);
   bCerrar.addActionListener(this);
 }
    @Override
 public void actionPerformed(ActionEvent eve){
  if(eve.getSource() == boton1){
    Pelicula1 p1 = new Pelicula1();
    p1.setVisible(true);
  }
  if(eve.getSource() == boton2){
    Pelicula2 p2 = new Pelicula2();
    p2.setVisible(true);
  }
  if(eve.getSource() == boton3){
    Pelicula3 p3 = new Pelicula3();
    p3.setVisible(true);
  }
  if(eve.getSource() == boton4){
    Pelicula4 p4 = new Pelicula4();
    p4.setVisible(true);
  }
  if(eve.getSource() == boton5){
    Pelicula5 p5 = new Pelicula5();
    p5.setVisible(true);
  }
  if(eve.getSource() == boton6){
    Pelicula6 p6 = new Pelicula6();
    p6.setVisible(true);
  }
  if(eve.getSource() == boton7){
    Pelicula7 p7 = new Pelicula7();
    p7.setVisible(true);
  }
  if(eve.getSource() == boton8){
    Pelicula8 p8 = new Pelicula8();
    p8.setVisible(true);
  }
  if(eve.getSource() == boton9){
    Pelicula9 p9 = new Pelicula9();
    p9.setVisible(true);
  }
  if(eve.getSource() == boton10){
    Pelicula10 p10 = new Pelicula10();
    p10.setVisible(true);
  }
  if(eve.getSource() == bCerrar){
    System.exit(0);
  }
 }
 
  public static void main(String[] args) {
    Peliculas obj1 = new Peliculas();
    obj1.setBounds(0, 0, 700, 700);
    obj1.setVisible(true);
    obj1.setResizable(true);
  }
}
