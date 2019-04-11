/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragraficadefracciones;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Efraín
 */
public class Ventana extends JFrame {
    private JButton suma, resta, multiplicacion, division;
    private JTextField num1, num2, den1, den2, numR, denR;
    public Ventana() {
        inicio();
    }
    private void inicio() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setTitle("Calculadora");
        Color color = new Color(67, 114, 185);
        this.getContentPane().setBackground(color);
        this.setLayout(null);
        
        this.suma = new JButton("Suma");
        //this.aprietame.setSize(100, 100);
        //this.aprietame.setLocation(23, 32);
        this.suma.setBounds(800, 50, 150, 50);
        this.add(this.suma);
        suma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String [] r = operacion("Suma");
                if(r == null)
                {
                    JOptionPane.showMessageDialog(null, "No se pueden las fracciones con denominador 0");
                } else {
                    numR.setText(r[1]);
                    denR.setText(r[2]);
                }
            }
        });
        
        this.resta = new JButton("Resta");
        this.resta.setBounds(800, 150, 150, 50);
        this.add(this.resta);
        resta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String [] r = operacion("Resta");
                if(r == null)
                {
                    JOptionPane.showMessageDialog(null, "No se pueden las fracciones con denominador 0");
                } else {
                    numR.setText(r[1]);
                    denR.setText(r[2]);
                }
            }
        });
        
        this.multiplicacion = new JButton("Multiplicacion");
        this.multiplicacion.setBounds(800, 250, 150, 50);
        this.add(this.multiplicacion);
        multiplicacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String [] r = operacion("Multiplicacion");
                if(r == null)
                {
                    JOptionPane.showMessageDialog(null, "No se pueden las fracciones con denominador 0");
                } else {
                    numR.setText(r[1]);
                    denR.setText(r[2]);
                }
            }
        });
        
        this.division = new JButton("Division");
        this.division.setBounds(800, 350, 150, 50);
        this.add(this.division);
        division.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String [] r = operacion("Division");
                if(r == null)
                {
                    JOptionPane.showMessageDialog(null, "No se pueden las fracciones con denominador 0");
                } else {
                    numR.setText(r[1]);
                    denR.setText(r[2]);
                }
            }
        });
 
        this.num1 = new JTextField();
        this.num1.setBounds(50, 200, 70, 50);
        this.add(this.num1);
        
        this.den1 = new JTextField();
        this.den1.setBounds(50, 260, 70, 50);
        this.add(this.den1);
        
        this.num2 = new JTextField();
        this.num2.setBounds(250, 200, 70, 50);
        this.add(this.num2);
        
        this.den2 = new JTextField();
        this.den2.setBounds(250, 260, 70, 50);
        this.add(this.den2);
        
        this.numR = new JTextField();
        this.numR.setBounds(450, 200, 70, 50);
        this.add(this.numR);
        
        this.denR = new JTextField();
        this.denR.setBounds(450, 260, 70, 50);
        this.add(this.denR);
        
    }
    
    public String [] operacion(String op) {
        int nu1 = Integer.parseInt(num1.getText());
        int de1 = Integer.parseInt(den1.getText());
        int nu2 = Integer.parseInt(num2.getText());
        int de2 = Integer.parseInt(den2.getText());
        if (de1 == 0 || de2 == 0)
        {
            return(null);
        }
        int nuR = 0, deR = 0;
        String [] resultado;
        resultado = new String [3];
        switch(op) {
            case "Suma":
                if (de1 == de2) {
                    nuR = nu1 + nu2;
                    deR = de1;
                } else {
                    nuR = (nu1 * de2) + (nu2 * de1);
                    deR = de1 * de2;
                }
                break;
            case "Resta":
                if (de1 == de2) {
                    nuR = nu1 - nu2;
                    deR = de1;
                } else {
                    nuR = (nu1 * de2) - (nu2 * de1);
                    deR = de1 * de2;
                }
                break;
            case "Multiplicacion":
                nuR = nu1 * nu2;
                deR = de1 * de2;
                break;
            case "Division":
                nuR = nu1 * de2;
                deR = de1 * nu2;
                break;
        }
        resultado[1] = Integer.toString(nuR);
        resultado[2] = Integer.toString(deR);
        return(resultado);
    }
}