import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoGUI{
    JFrame figura;
    Container canvas ;
    JButton tombol1 , tombol2;

    DemoGUI(){
        figura = new JFrame("Frame Ku");
        canvas = figura.getContentPane();
        tombol1 = new JButton("Click Saya bang");
        tombol2 = new JButton("Click me");
        tombol1.addActionListener(new AksiUntukTombol());
        tombol2.addActionListener(new AksiUntukTombol2());
        canvas.setLayout(new FlowLayout());
        canvas.add(tombol1);
        canvas.add(tombol2);
        figura.setSize(500,500);
        figura.setLocationRelativeTo(null);
        figura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        figura.setVisible(true);
    }
    class AksiUntukTombol implements ActionListener {
        //Tombol ini dipanggil otomatis ketika tombol di klik
        public void actionPerformed(ActionEvent e){
            tombolDiklik();
        }
    }
    class AksiUntukTombol2 implements ActionListener {
        //Tombol ini dipanggil otomatis ketika tombol di klik
        public void actionPerformed(ActionEvent e){
            tombolDiklik2();
        }
    }
    public void tombolDiklik(){
        System.out.println("Tombol Di Klik...");
    }
    public void tombolDiklik2(){
        System.out.println("Tombol dua Di Klik...");
    }

    public static void main(String[]args){
        new DemoGUI();
    }
}