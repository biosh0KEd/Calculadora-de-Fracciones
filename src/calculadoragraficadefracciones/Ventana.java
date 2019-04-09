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
    private JButton aprietame;
    private JTextField TB1;
    private JTextField TB2;
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
        
        this.aprietame = new JButton("Aprietame");
        //this.aprietame.setSize(100, 100);
        //this.aprietame.setLocation(23, 32);
        this.aprietame.setBounds(50, 0, 150, 50);
        this.add(this.aprietame);
        aprietame.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bien");
            }
        });
 
        
        this.TB1 = new JTextField();
        this.TB1.setBounds(250, 200, 400, 100);
        this.add(this.TB1);
        
        this.TB2 = new JTextField();
        this.TB2.setBounds(250, 500, 400, 100);
        this.add(this.TB2);
    }
}