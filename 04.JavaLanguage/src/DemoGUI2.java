import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoGUI2{
    JFrame figura;
    Container canvas ;
    JButton tombol1 , tombol2 , tombol3;

    DemoGUI2(){
        figura = new JFrame("Frame Ku");
        canvas = figura.getContentPane();
        tombol1 = new JButton("Click Saya bang");
        tombol2 = new JButton("Click me");
        tombol3 = new JButton("click gua cuy");
        tombol1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("Tombol di click");
                }
        });
        tombol2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("Tombol kedua di click");
                }
        });
        tombol3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("Tombol ketiga di click");
                }
        });
        canvas.setLayout(new FlowLayout());
        canvas.add(tombol1);
        canvas.add(tombol2);   
        canvas.add(tombol3); 
        figura.setSize(500,500);
        figura.setLocationRelativeTo(null);
        figura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        figura.setVisible(true);
    }
        public static void main(String[]args){
        new DemoGUI2();
    }
}