package src.drawFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class gameframe extends Frame implements WindowListener {


    public gameframe() {
//        WindowListener listener = new mywindowlistener();
        this.addWindowListener(this);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        g.drawRect(100, 100, 200, 100);

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "goodbye");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
