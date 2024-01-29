/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Mouse Events Demo
package GUIEventHandling;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author QA_OnFarmQT
 */ 
public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    
    TextField tf;
    
    public MouseEventsDemo(String title) {
        
        super(title);
        tf = new TextField(60);
        addMouseListener(this);
    }
    
    public void LaunchFrame() {
        // Menambah komponen di dalam frame
        add(tf, BorderLayout.SOUTH);
            setSize(300,300);
            setVisible(true);
    }
    
    public void mouseClicked(MouseEvent me) {
        String msg = "Mouse Clicked.";
        tf.setText(msg);
    }
    
    public void mouseEntered(MouseEvent me) {
        String msg = "Mouse entered component";
        tf.setText(msg);
    }
    
    public void mouseExited(MouseEvent me) {
        String msg = "Mouse exited component.";
        tf.setText(msg);
    }
    
    public void mousePressed(MouseEvent me) {
        String msg = "Mouse pressed component.";
        tf.setText(msg);
    }
    
    public void mouseReleased(MouseEvent me) {
        String msg = "Mouse released component.";
        tf.setText(msg);
    }
    
    public void mouseDragged(MouseEvent me) {
        String msg = "Mouse dragged at " + me.getX() + "," + me.getY();
        tf.setText(msg);
    }
    
    public void mouseMoved(MouseEvent me) {
        String msg = "Mouse moved at " + me.getX() + "," + me.getY();
        tf.setText(msg);
    }
    
    public static void main(string[] args) {
        MouseEventsDemo med = new MouseEventsDemo("Mouse Events Demo");
        med.LaunchFrame();
    }
    
    
        
    }

